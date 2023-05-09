package com.yearup.hotel;

public class Room {
    private int numberOfBeds;
    private double price;
    private RoomStatus roomStatus;

    // Getters and Setters
    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }


    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Constructor
    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
    }

    public void checkIn() {
        setRoomStatus(RoomStatus.OCCUPIED_AND_DIRTY);
    }

    public void checkOut() {
        setRoomStatus(RoomStatus.UNOCCUPIED_AND_DIRTY);
    }

    public void cleanRoom() {
        if (roomStatus == RoomStatus.OCCUPIED_AND_DIRTY) {
            roomStatus = RoomStatus.OCCUPIED;
        } else if (roomStatus == RoomStatus.UNOCCUPIED_AND_DIRTY) {
            roomStatus = RoomStatus.AVAILABLE;
        }
    }
}
