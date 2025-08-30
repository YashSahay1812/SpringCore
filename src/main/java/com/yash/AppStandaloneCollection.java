package com.yash;

import com.yash.beans.standalone.collection.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppStandaloneCollection {

    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext(
                "beans/standalone-collection/config.xml");

        Employee e1 = context.getBean("employee1", Employee.class);
        Employee e2 = context.getBean("employee2", Employee.class);
        System.out.println(e1);
        System.out.println(e2);
    }

}
