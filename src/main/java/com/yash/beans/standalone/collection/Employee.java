package com.yash.beans.standalone.collection;

import java.util.Set;

public class Employee {
    private String name;
    private Set<String> phones;

    public Employee() {}

    public Employee(String name, Set<String> phones) {
        this.name = name;
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public Set<String> getPhones() {
        return phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(Set<String> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phones=" + phones +
                '}';
    }
}
