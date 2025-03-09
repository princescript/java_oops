package com.innerclasses.staticnestedclass;

public class Computer {
    // Private instance variables for computer details
    private String name;
    private String model;

    // Instance of OperatingSystem inner class
    private OperatingSystem os;

    // Constructor to initialize computer details
    public Computer(String name, String model, String osName) {
        this.name = name;
        this.model = model;
        this.os = new OperatingSystem(osName); // Creating an instance of OperatingSystem
    }

    // Static Nested Class representing a USB device
    static class USB {
        private String type;

        // Constructor to initialize USB type
        public USB(String type) {
            this.type = type;
        }

        // Method to display USB details
        public void displayInfo(){
            System.out.println("USB :" + type);
        }
    }

    // Getter method to access the OperatingSystem instance
    public OperatingSystem getOs() {
        return os;
    }

    // Member Inner Class representing an Operating System
    class OperatingSystem {
        private String osName;

        // Constructor to initialize OS name
        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        // Method to display Operating System details
        public void displayInfo(){
            System.out.println("Computer Model :" + model + ", OS: " + osName);
        }
    }
}
