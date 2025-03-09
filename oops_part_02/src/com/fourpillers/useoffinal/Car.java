package com.fourpillers.useoffinal;

public final class Car extends Vehicale{
//Final Variable (Constant Value)
//Final Method (Prevent Overriding)
//Final Class (Prevent Inheritance) s

    private  final int speedLimit ;

    public Car(){
        speedLimit = 400;
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void decelerate() {

    }
    public final void airBags(){
        System.out.println("4 AirBags");
    }

}
