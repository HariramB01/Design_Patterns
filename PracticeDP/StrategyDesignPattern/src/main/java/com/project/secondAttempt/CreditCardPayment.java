package com.project.secondAttempt;

public class CreditCardPayment implements Payment{
    private String creditCardNumber;
    private String password;

    public CreditCardPayment(String creditCardNumber, String password) {
        this.creditCardNumber = creditCardNumber;
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount+" credit card Pay");
    }
}
