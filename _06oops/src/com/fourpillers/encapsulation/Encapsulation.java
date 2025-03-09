package com.fourpillers.encapsulation;

public class Encapsulation {
    //class contains properties|fields|instance variable and behaviour
    private String name;
    private int  rollNumber;
    private int age;

    public void setAge(int age) {
        if(age <=0){
            System.out.println("Invalid Age");
            return;
        }else {
            this.age = age;
        }

    }
}
