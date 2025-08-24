package com.aditya;

public class Student {

   private int age;
   private Laptop laptop;
    private Computer computer;

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

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        computer.compile();
        this.computer = computer;
    }

    public void code() {
        computer.compile();
        System.out.println("Aditya is coding....");
    }
}
