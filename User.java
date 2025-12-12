package com.hotel.model;

public class User {
    private String username;
    private String password;
    private String fullName;
    private int age;
    private String phoneNumber;
    private String address;
    private String role;

    public User(String username, String password, String fullName, int age, String phoneNumber, String address, String role) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.role = role;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getFullName() { return fullName; }
    public int getAge() { return age; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }
    public String getRole() { return role; }
}