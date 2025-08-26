package com.yash.beans.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    private String name;

    @Autowired
    private Address address;

    public Person() {}

    public Person(String name, Address address) {
        System.out.println("Constructor gets invoked");
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        System.out.println("Setter gets invoked");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
