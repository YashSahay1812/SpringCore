package com.yash;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppLifeCycle {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                "beans/setter-injection/primitive/student-config.xml");
        context.registerShutdownHook();

    }

}
