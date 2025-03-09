package com.innerclasses.anonymousinnerclass;

public class Test {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(120);

        //CreditCardVo creditCard = new CreditCardVo("111111111");
        //anonymous inner class
        //1️⃣ When you need to override a method in an interface or class without creating a separate subclass
        //2️⃣ When the class is only needed once and does not require reuse ,To make the code more concise and readable
        //3️⃣ To handle event listeners in GUI applications

        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid " + amount + " using credit card");
            }
        });

        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid " + amount + " using paypal");

            }
        });
    }
}
