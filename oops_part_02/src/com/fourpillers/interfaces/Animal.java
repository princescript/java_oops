package com.fourpillers.interfaces;

public interface Animal {
    //1️⃣ abstract method and static constants
    //2️⃣ Variables in an interface are always public static final (constants)
    //3️⃣ and method by default abstract and public
    //4️⃣ can have default & static  methods (Java 8+)

    public final static  int MAX_AGE = 40;
    public abstract void eat();
    void sleep();

    public static void info(){
        System.out.println("This is info from Animal Interface.");
    }
    //concrete method in interface
    public default void run(){
        this.sleep();
        this.eat();// can call implemented abstract method
        System.out.println("Animal is Running.");
    }
}
