package com.fourpillers.useofstatic;

import javax.xml.transform.Source;

public class Test {
    //static member
    //static method
    //static block - execute when class load in memory

    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        System.out.println(Student.count);
        System.out.println(Student.getCount());
        int x = sum(10,20);
        System.out.println(x);
        System.out.println(Utils.max(110,20));
        System.out.println(Utils.trimAndUpperCase(" kidno l    "));
        School school = School.getInstance();

        System.out.println(Utils.PI);


    }
    public static int sum(int a , int b ){
        return a + b;

    }
}
