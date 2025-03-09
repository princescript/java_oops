package com.innerclasses.anonymousinnerclass;

public class CreditCardVo implements Payment{

    private String creditCardNumber ;

    public CreditCardVo(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using credit card");
    }
}
