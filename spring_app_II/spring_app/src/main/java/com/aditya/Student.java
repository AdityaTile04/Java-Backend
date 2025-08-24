package com.aditya;

public class Student {

   private int age;

    public Student() {
        System.out.println("Student object is created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printName() {
        System.out.println("Aditya Tile");
    }
}
