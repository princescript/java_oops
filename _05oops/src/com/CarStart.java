package com;

public class CarStart {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setSpeed(100);
        c1.topSpeed();
        c1.accelerate(30);
        c1.topSpeed();
        c1.GetDetails();
    }
}
