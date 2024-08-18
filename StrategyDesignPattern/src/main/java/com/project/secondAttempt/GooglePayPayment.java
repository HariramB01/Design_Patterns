package com.project.secondAttempt;

public class GooglePayPayment implements Payment{
    private String contact;

    public GooglePayPayment(String contact) {
        this.contact = contact;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount+" google Pay");
    }
}
