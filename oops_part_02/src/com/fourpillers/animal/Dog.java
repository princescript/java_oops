package com.fourpillers.animal;

public class Dog extends Animal {

    @Override
    public  void sayHello(){
        System.out.println("woof woof " + this.getName());
    }
}
