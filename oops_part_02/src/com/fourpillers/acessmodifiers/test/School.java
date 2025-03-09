package com.fourpillers.acessmodifiers.test;

public class School {
    //variable
    private static  School school;
    // Private constructor to prevent instantiation
    private School(){}

    // allow one time object creation
    public static School getInstance(){
        if(school == null){
            school = new School();
        }
        return school;
    }
}
