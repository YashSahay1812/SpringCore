package com.yash.beans.reference;

public class Address {
    private String country;
    private String state;
    private String city;

    public Address() {}

    public Address(String country, String state, String city) {
        this.country = country;
        this.state = state;
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city=" + city +
                '}';
    }
}
