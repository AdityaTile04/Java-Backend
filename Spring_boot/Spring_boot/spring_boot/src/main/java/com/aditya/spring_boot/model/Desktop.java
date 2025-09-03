package com.aditya.spring_boot.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile() {
        System.out.println("Compile code using desktop");
    }
}
