package com.yash.beans.primitive;

public class Student {
    private int id;
    private String name;
    private String address;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void init() {
        System.out.println("Student bean has been initialized : " + this);
    }

    public void destroy() {
        System.out.println("Student bean is about to be destroyed : " + this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
