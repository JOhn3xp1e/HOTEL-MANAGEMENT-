package com.hotel.model;

import java.time.LocalDateTime;

public class Guest {
    private int guestId;
    private String username;
    private String fullName;
    private int age;
    private String phone;
    private String roomNo;
    private LocalDateTime checkInDate;
    private LocalDateTime checkOutDate;
    private String status;
    private int loyaltyPoints;

    public Guest(int guestId, String username, String fullName, int age, String phone, String roomNo, 
                 LocalDateTime checkInDate, LocalDateTime checkOutDate, String status, int loyaltyPoints) {
        this.guestId = guestId;
        this.username = username;
        this.fullName = fullName;
        this.age = age;
        this.phone = phone;
        this.roomNo = roomNo;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.status = status;
        this.loyaltyPoints = loyaltyPoints;
    }

    // Getters and Setters
    public int getGuestId() { return guestId; }
    public void setGuestId(int guestId) { this.guestId = guestId; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getRoomNo() { return roomNo; }
    public void setRoomNo(String roomNo) { this.roomNo = roomNo; }
    public LocalDateTime getCheckInDate() { return checkInDate; }
    public void setCheckInDate(LocalDateTime checkInDate) { this.checkInDate = checkInDate; }
    public LocalDateTime getCheckOutDate() { return checkOutDate; }
    public void setCheckOutDate(LocalDateTime checkOutDate) { this.checkOutDate = checkOutDate; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public int getLoyaltyPoints() { return loyaltyPoints; }
    public void setLoyaltyPoints(int loyaltyPoints) { this.loyaltyPoints = loyaltyPoints; }
}