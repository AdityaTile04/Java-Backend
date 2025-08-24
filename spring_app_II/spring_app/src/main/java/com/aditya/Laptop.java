package com.aditya;

public class Laptop {

    private String brand;

    public Laptop() {
        System.out.println("Laptop object created");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void compile() {
        System.out.println("compiling....");
    }
}
