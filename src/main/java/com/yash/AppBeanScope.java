package com.yash;

import com.yash.beans.scope.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppBeanScope {
    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext(
                "beans/scope/config.xml");

        Person p1_1 = context.getBean("person1", Person.class);
        System.out.println(p1_1.hashCode());
        System.out.println(p1_1.getAddress().hashCode());
        Person p1_2 = context.getBean("person1", Person.class);
        System.out.println(p1_2.hashCode());
        System.out.println(p1_2.getAddress().hashCode());
    }
}
