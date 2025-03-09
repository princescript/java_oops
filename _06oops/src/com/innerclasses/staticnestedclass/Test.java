package com.innerclasses.staticnestedclass;

public class Test {
    public static void main(String[] args) {
        // Creating a Computer instance with name, model, and OS
        Computer computer = new Computer("Hp", "z100", "linux");

        // Accessing the OperatingSystem inner class and displaying OS details
        computer.getOs().displayInfo();

        // Creating instances of the static nested USB class
        Computer.USB usb = new Computer.USB("Type_C");
        Computer.USB usb1 = new Computer.USB("Type_C");
    }
}