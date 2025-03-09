package com.fourpillers.abstraction;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sayHello();

        //🔹 When to Use an Anonymous Inner Class?
        //✅ When you only need a single-use implementation of an abstract class or interface.
        //✅ When you don't want to create a separate subclass.

        Animal animal = new Animal() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Animal!");
            }
        };
    }
}
