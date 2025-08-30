package com.yash.beans.stereotype.annotations;

import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class Employee {
    private String name;
    private Set<String> phones;

    public Employee() {}

    public Employee(String name, Set<String> phones) {
        this.name = name;
        this.phones = phones;
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
