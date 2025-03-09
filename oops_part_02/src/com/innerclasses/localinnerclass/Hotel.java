package com.innerclasses.localinnerclass;

public class Hotel {
    // Private instance variables to store hotel details
    private String name;
    private int totalRooms;
    private int reservedRooms;

    // Constructor to initialize hotel details
    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    // Method to reserve rooms for a guest
    public void reserveRoom(String guestName, int numOfRooms){

        // Local inner class for validation
        class ReservationValidator{

            // Method to validate reservation conditions
            boolean validate(){
                if(guestName == null || guestName.isBlank()){
                    System.out.println("Guest name can not be empty");
                    return false;
                }
                if(numOfRooms < 0){
                    System.out.println("Number of rooms should be positive");
                    return false;
                }
                if(reservedRooms + numOfRooms > totalRooms){
                    System.out.println("Room is not available");
                    return false;
                }
                return true; // Reservation is valid
            }
        }

        // Creating an instance of the local inner class
        ReservationValidator reservationValidator = new ReservationValidator();

        // Checking if the reservation is valid
        if(reservationValidator.validate()){
            reservedRooms += numOfRooms; // Update reserved rooms count
            System.out.println("Reservation confirmed for " + guestName + " for " + numOfRooms + " rooms");
        } else {
            System.out.println("Reservation failed");
        }
    }
}
