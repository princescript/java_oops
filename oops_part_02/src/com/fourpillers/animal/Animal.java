package com.fourpillers.animal;

public class Animal {
    private String  name;
    private int age;

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
    public void eat(){
        System.out.println("This animal eats food");
    }
    public void sayHello(){
        System.out.printf("Hello form Animal %s", this.name);
    }
}
