package com.aditya.spring_boot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    @Override
    public void compile() {
        System.out.println("Compile code using laptop");
    }

    public void model() {
        System.out.println("macbook air m4");
    }
}
