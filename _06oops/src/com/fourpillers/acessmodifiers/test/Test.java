package com.fourpillers.acessmodifiers.test;

import com.fourpillers.acessmodifiers.school.Student;
import com.fourpillers.acessmodifiers.zoo.Dog;

public class Test {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.age = 12;
//        student.name = "Prince";
//        student.sayHello();
//
//        School.getInstance();
        Dog dog = new Dog("tommy");
        dog.makesound();
        dog.setDogSound("mew");
        dog.makesound();
        dog.wagTail();
    }
}
