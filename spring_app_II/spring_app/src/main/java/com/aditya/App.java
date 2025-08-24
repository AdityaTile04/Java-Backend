package com.aditya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       Student s = (Student) context.getBean( "student" );
//        s.setAge( 21 );
        System.out.println(s.getAge());

        Laptop l = (Laptop) context.getBean( "laptop" );
        System.out.println(l.getBrand());
    }
}
