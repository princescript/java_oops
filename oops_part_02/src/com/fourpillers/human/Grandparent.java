package com.fourpillers.human;

public class Grandparent {
    //multilevel inheritance
    private String name;
    private int age;
    private boolean hasSuperPower;

    public Grandparent(){
        hasSuperPower = false;
        System.out.println("GrandParent Constructor Called");
    }


    public boolean isHasSuperPower() {
        return hasSuperPower;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
