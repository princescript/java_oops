package com.fourpillers.useofstatic;

public class Student {
    private int id ;
    private int age;
    private String name;

    public static int count = 0;

    //static block
    static {
        System.out.println("Hello");
    }

    public Student(){
        count++;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount(){
        return count;
    }


}
