package com.aditya;

public class Desktop implements Computer{
    public Desktop() {
        System.out.println("Desktop bean is created!");
    }

    @Override
    public void compile() {
        System.out.println("Compile code in Desktop");
    }
}
