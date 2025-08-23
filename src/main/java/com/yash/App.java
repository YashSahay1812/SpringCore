package com.yash;

import com.yash.beans.collection.Employee;
import com.yash.beans.primitive.Student;
import com.yash.beans.reference.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
            "beans/primitive/student-config.xml",
            "beans/collection/employee-config.xml",
            "beans/reference/person-config.xml"
        });

        // PrimitiveType Beans :
        Student s1 = (Student) context.getBean("student1");
        Student s2 = (Student) context.getBean("student2");
        Student s3 = (Student) context.getBean("student3");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("--------------------------------------------------------");

        // CollectionType Beans :
        Employee e1 = (Employee) context.getBean("employee1");
        System.out.println(e1);

        System.out.println("--------------------------------------------------------");

        // ReferenceType Beans :
        Person p1 = (Person) context.getBean("person1");
        Person p2 = (Person) context.getBean("person2");
        Person p3 = (Person) context.getBean("person3");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
