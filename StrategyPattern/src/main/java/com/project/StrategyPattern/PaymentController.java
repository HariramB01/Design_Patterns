package com.project.StrategyPattern;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentContext paymentContext;

    @Autowired
    public PaymentController(PaymentContext paymentContext) {
        this.paymentContext = paymentContext;
    }

    @PostMapping("/pay")
    public ResponseEntity<String> pay(@RequestParam String paymentMethod, @RequestParam double amount) {
        // Delegate to PaymentContext
        paymentContext.pay(paymentMethod, amount);
        return ResponseEntity.ok("Payment of " + amount + " made using " + paymentMethod);
    }
}
