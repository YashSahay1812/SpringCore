package com.yash;

import com.yash.beans.stereotype.annotations.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppStereotypeAnnotation {
    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext(
                "beans/stereotype-annotation/config.xml");
        Employee e1 = context.getBean("employee", Employee.class);
        System.out.println(e1);
    }
}
