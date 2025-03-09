package com.innerclasses.memberinnerclass;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Tata Safari");
        Car.Engine engine = car.new Engine();
        //engine.start();
        //engine.stop();


        //without member inner class
        Bike bike = new Bike("Bullet");
        Engine engine1 = new Engine(bike);
        engine1.start();
        engine1.stop();

    }
}
