package com.yash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
                "student-config.xml", "employee-config.xml"});

        // Student Beans :
        Student s1 = (Student) context.getBean("student1");
        Student s2 = (Student) context.getBean("student2");
        Student s3 = (Student) context.getBean("student3");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // Employee Beans :
        Employee e1 = (Employee) context.getBean("employee1");
        System.out.println(e1);
    }
}
