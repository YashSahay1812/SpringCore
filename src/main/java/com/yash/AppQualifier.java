package com.yash;

import com.yash.beans.autowiring.qualifier.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppQualifier {

    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext(
                "beans/autowiring/qualifier/config.xml");
        final Car c1 = (Car) context.getBean("car1");
        System.out.println(c1);
    }

}
