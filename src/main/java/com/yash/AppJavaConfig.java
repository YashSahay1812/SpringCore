package com.yash;

import com.yash.javaconfig.beans.Address;
import com.yash.javaconfig.beans.JavaConfig;
import com.yash.javaconfig.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppJavaConfig {

    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Address a1 = context.getBean("address", Address.class);
        System.out.println(a1);
        Person p1 = context.getBean("person", Person.class);
        System.out.println(p1);
    }

}
