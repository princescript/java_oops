package com.fourpillers.animal;

public class Test {
    public static void main(String[] args) {
//        Dog dog  = new Dog();
//        dog.setName("street");
//        dog.sayHello();
//
//        Cat cat = new Cat();
//        cat.setName("milky");
//        cat.sayHello();
        Animal animal = new Animal();
        animal.sayHello();
        System.out.println();

        Animal dog = new Dog(); // Upcasting
        dog.sayHello();
        System.out.println();

        Animal cat = new Cat();
        cat.sayHello();
        Cat realcat = (Cat) cat;
        realcat.scratch();

    }
}
