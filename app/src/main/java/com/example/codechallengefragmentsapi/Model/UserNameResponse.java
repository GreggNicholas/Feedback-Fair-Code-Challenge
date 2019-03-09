package com.example.codechallengefragmentsapi.Model;

public class UserNameResponse {

    private String name;
    private String username;
    private String email;
    private String address;
    private String phone;

    public UserNameResponse(String name, String username, String email, String address, String phone) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}
