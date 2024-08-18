package com.project.StrategyPattern;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentContext {

    private final Map<String, PaymentStrategy> strategies;

    @Autowired
    public PaymentContext(Map<String, PaymentStrategy> strategies) {
        this.strategies = strategies;
    }

    public void pay(String paymentMethod, double amount) {
        // Retrieve the appropriate strategy from the map
        PaymentStrategy strategy = strategies.get(paymentMethod);
        if (strategy != null) {
            // Delegate the payment processing to the selected strategy
            strategy.pay(amount);
        } else {
            System.out.println(strategy);
            throw new IllegalArgumentException("Payment method " + paymentMethod + " is not supported.");
        }
    }
}
