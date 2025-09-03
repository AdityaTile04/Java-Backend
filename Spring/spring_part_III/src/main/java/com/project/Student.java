package com.project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value( "21" )
     int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void printName() {
        System.out.println("Aditya Tile");
    }
}
