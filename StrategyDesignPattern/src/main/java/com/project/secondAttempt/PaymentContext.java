package com.project.secondAttempt;

public class PaymentContext {
    private Payment payment;

    public PaymentContext(Payment payment) {
        this.payment = payment;
    }

    public void setPayment(Payment payment){
        this.payment = payment;
    }

    public void pay(double amount){
        payment.pay(amount);
    }
}
