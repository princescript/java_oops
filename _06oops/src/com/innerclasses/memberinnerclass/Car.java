package com.innerclasses.memberinnerclass;

public class Car {
    // Private instance variables for car properties
    private String model;
    private boolean isEngineOn;

    // Constructor to initialize car details
    public Car(String model){
        this.isEngineOn = false; // Engine is off by default
        this.model = model;
    }

    // Member Inner Class representing the Engine
    class Engine {
        // Method to start the engine
        void start(){
            if(!isEngineOn){
                isEngineOn = true; // Turn the engine on
                System.out.println(model + " engine started");
            }
            else{
                System.out.println(model + " engine is already on");
            }
        }

        // Method to stop the engine
        void stop(){
            if(isEngineOn){
                isEngineOn = false; // Turn the engine off
                System.out.println(model + " engine stopped");
            }
            else {
                System.out.println(model + " engine is already stopped");
            }
        }
    }
}
