package com.innerclasses.localinnerclass;

public class Test {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Morya",10,5);
        hotel.reserveRoom("Prince", 5);
        hotel.reserveRoom("Sahil",10);
    }
}
