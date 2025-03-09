package com.innerclasses.anonymousinnerclass;

public class ShoppingCart  {
    private double totalAmount;

    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public void processPayment(Payment payment){
        payment.pay(totalAmount);
    }
}
