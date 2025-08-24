package com.aditya;

public class Student {

   private int age;
   private Laptop laptop;

    public Student() {
        System.out.println("Student object is created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLap() {
        return laptop;
    }

    public void setLap(Laptop laptop) {
        this.laptop = laptop;
    }

    public void compile() {
        laptop.code();
    }

    public void printName() {
        System.out.println("Aditya Tile");
    }
}
