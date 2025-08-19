package com.aditya;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class StudentDetails {
    @Id
    private int id;
    private String name;
    private int age;
    @OneToMany(mappedBy = "studentDetails")
    private List<Laptop> laptops;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", laptop=" + laptops +
                '}';
    }
}
