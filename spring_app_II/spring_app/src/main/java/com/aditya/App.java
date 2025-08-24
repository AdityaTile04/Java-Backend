package com.aditya;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Car c = context.getBean( "car", Car.class );
        System.out.println(c.carBrand + " " + c.model);

    }
}
