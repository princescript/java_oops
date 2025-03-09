package com.fourpillers.animal;

public class Cat  extends  Animal{
    @Override
    public void sayHello(){
        System.out.println("meow meow  " + this.getName());

    }
    public void scratch() {  // Method specific to Cat
        System.out.println("Cat is scratching!");
    }
}
