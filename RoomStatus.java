package com.hotel.model;

public enum RoomStatus {
    BOOKED,
    UNDER_MAINTENANCE,
    RESERVED,
    FREE;

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase().replace("_", " ");
    }
}