package com.yash.beans.stereotype.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component("emp")
public class Employee {

    @Value("Yash")
    private String name;

    @Autowired
    @Qualifier("phones")
    private Set<String> phones;

    public Employee() {
        System.out.println("No arg constructor invoked");
    }

    public Employee(String name, Set<String> phones) {
        System.out.println("All args constructor invoked");
        this.name = name;
        this.phones = phones;
    }

    public void setName(String name) {
        System.out.println("Called setName()");
        this.name = name;
    }

    public void setPhones(Set<String> phones) {
        System.out.println("Called setPhones()");
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
