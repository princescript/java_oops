package com.innerclasses.memberinnerclass;

public class Engine {
    //storing bike obj instance
    private Bike bike;

    public Engine(Bike bike) {
        this.bike = bike;
    }

    void start() {
        if (!bike.isEngineOn()) {
            bike.setEngineOn(true);
            System.out.println(bike.getModel() + " engine started.");
        } else {
            System.out.println(bike.getModel() + " engine already started.");

        }
    }

    void stop() {
        if (bike.isEngineOn()) {
            bike.setEngineOn(false);
            System.out.println(bike.getModel() + " engine stoped");
        } else {
            System.out.println(bike.getModel() + " engine is already stoped");
        }
    }
}
