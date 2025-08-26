package com.yash;

import com.yash.beans.autowiring.Person;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAutowiring {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "beans/autowiring/config.xml");

        Person p1 = (Person) context.getBean("person1");
        System.out.println(p1);

    }

}
