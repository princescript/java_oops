package com.fourpillers.encapsulation;

public class Constructor {
    private String name;
    private int  rollNumber;
    private int age;
    public Constructor(){}

    public Constructor(String name , int rollNumber, int age) {
    if(name == null || name.trim().isEmpty()){
        throw new IllegalArgumentException("Invalid Name");
    }
    if(age <= 0 && age > 101){
        throw new IllegalArgumentException("Invalid Age");
    }
    }
    public int getAge() {
        return age;
    }

}
