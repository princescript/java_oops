package com.fourpillers.abstraction;

public abstract class Animal {
    private String name;
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


    //you can add both abstract method and concrete method in abstract class

    //abstract method
     public abstract  void  sayHello();

     //concrete method
     public  void sleep(){
         System.out.println("Animal Sleeping.");
     }
}
