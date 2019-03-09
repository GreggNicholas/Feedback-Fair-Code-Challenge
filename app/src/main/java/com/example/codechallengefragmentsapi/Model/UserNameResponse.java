package com.example.codechallengefragmentsapi.Model;

public class UserNameResponse {

    private String name;
    private String email;
    private UserAddressResponse address;
    private String phone;

    public UserNameResponse(String name, String email, UserAddressResponse address, String phone) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }

    public UserAddressResponse getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}
