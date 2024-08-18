package com.project.StrategyPattern;

import org.springframework.stereotype.Service;

public class PaymentService {


    @Service("creditCardPayment")
    public class CreditCardPayment implements PaymentStrategy {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using Credit Card.");
            // Logic to process payment using a credit card
        }
    }

    @Service("paypalPayment")
    public class PayPalPayment implements PaymentStrategy {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using PayPal.");
            // Logic to process payment using PayPal
        }
    }

    @Service("googlePayPayment")
    public class GooglePayPayment implements PaymentStrategy {
        @Override
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using Google Pay.");
            // Logic to process payment using Google Pay
        }
    }



}
