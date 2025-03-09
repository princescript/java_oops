package com.innerclasses.memberinnerclass;

public class Bike {
    //without member inner class
    private String model;
    private boolean isEngineOn;

    public Bike(String model){
        this.model = model;
        this.isEngineOn = false;
    }
    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }
    public String getModel(){
        return this.model;
    }

}
