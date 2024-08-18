package com.project.secondAttempt;

public class PayPalPayment implements Payment{
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount+" pay pal Pay");
    }
}
