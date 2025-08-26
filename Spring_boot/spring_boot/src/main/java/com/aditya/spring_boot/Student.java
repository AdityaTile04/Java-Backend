package com.aditya.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    @Qualifier("desktop")
    Computer computer;

    public void printName() {
        System.out.println("Aditya");
        computer.compile();
    }
}
