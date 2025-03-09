package com.fourpillers.useofstatic;

public class School {
    private static School school = new School();
    private School(){}

    public static School getInstance(){
        return school;
    }
}
