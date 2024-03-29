package com.example.codechallengefragmentsapi.Model;

public class UserAddressResponse {

    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private String geo;

    public UserAddressResponse(String street, String suite, String city, String zipcode, String geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    public String getStreet() {
        return street;
    }

    public String getSuite() {
        return suite;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getGeo() {
        return geo;
    }
}
