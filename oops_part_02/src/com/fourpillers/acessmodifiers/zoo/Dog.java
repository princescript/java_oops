package com.fourpillers.acessmodifiers.zoo;

public class Dog extends Animal{
    // Child constructor must explicitly call super() with parameters
    public Dog(String name){
        super(name, "Bark");
    }
    public void wagTail(){
        System.out.println(getName() + " is wagging its tail.");
    }
    private String getName(){
        return getClass().getSimpleName();
    }
    public void setDogSound(String newSound){
        changeSound(newSound);
    }
}
