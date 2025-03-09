package com.fourpillers.interfaces;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
//        dog.eat();
//        dog.sleep();
//        System.out.println(dog.MAX_AGE);
//        System.out.println(Animal.MAX_AGE);
// static  method  of Interface , only can be accessed via Interface reference
        Animal.info();
// default method  of Interface , only can be accessed via Class reference
        dog.run();

        cat.run();

    }
}
