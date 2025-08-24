package com.yash;

import com.yash.beans.collection.Employee;
import com.yash.beans.constructorinjectionambiguity.BinaryAdder;
import com.yash.beans.primitive.Student;
import com.yash.beans.reference.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
                "beans/setter-injection/primitive/student-config.xml",
                "beans/setter-injection/collection/employee-config.xml",
                "beans/setter-injection/reference/person-config.xml",
                "beans/constructor-injection/collection/employee-config.xml",
                "beans/constructor-injection/reference/person-config.xml",
                "beans/constructor-injection/ambiguity/binary-adder-config.xml"
        });

        System.out.println("***************** Setter Injection ******************");
        System.out.println(" ");

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

        System.out.println(" ");
        System.out.println("****************** Constructor Injection *******************");
        System.out.println(" ");

        // CollectionType Beans :
        Employee ec1 = (Employee) context.getBean("employeeC1");
        System.out.println(ec1);

        System.out.println("-----------------------------------------------------------");

        // ReferenceType Beans :
        Person pc1 = (Person) context.getBean("personC1");
        Person pc2 = (Person) context.getBean("personC2");
        Person pc3 = (Person) context.getBean("personC3");
        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println(pc3);

        // Resolving Ambiguity in Constructor Injection
        BinaryAdder adder = (BinaryAdder) context.getBean("adder");
        System.out.println(adder);
    }
}
