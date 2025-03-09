package com.fourpillers.acessmodifiers.zoo;

public class Animal {
    private String name ;
    protected String  sound;
    // Parameterized constructor
    public Animal(String name , String sound){
        this.name = name;
        this.sound = sound;
    }
    public void makesound(){
        System.out.println(name +  " make a sound: " + sound);
    }
     protected void changeSound(String newSound){
        this.sound = newSound;
    }
}
