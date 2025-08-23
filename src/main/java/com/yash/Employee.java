package com.yash;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private String name;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String, String> courses;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                ", addresses=" + addresses +
                ", courses=" + courses +
                '}';
    }
}
