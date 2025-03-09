package com;

public class Car {

    private String color;
    private String model;
    private String brand;
    private int year;
    private int speed;


    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void GetDetails(){
        System.out.println(color + " " + model + " " + brand + " " + year);
    }
    public void accelerate(int acc){
        speed += acc;
    }
    public void topSpeed(){
        System.out.printf("Top Speed Of Car is : %d %n",speed);
    }
}
