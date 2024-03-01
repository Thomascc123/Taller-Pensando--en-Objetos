package com.example.demo;

public class Room {
    public static int roomId;
    public static boolean occupied;
    public static double pricePerDay;

    public static int getRoomId() {
        return roomId;
    }

    public static void setRoomId(int roomId) {
        Room.roomId = roomId;
    }

    public static boolean isOccupied() {
        return occupied;
    }

    public static void setOccupied(boolean occupied) {
        Room.occupied = occupied;
    }

    public static double getPricePerDay() {
        return pricePerDay;
    }

    public static void setPricePerDay(double pricePerDay) {
        Room.pricePerDay = pricePerDay;
    }
}
