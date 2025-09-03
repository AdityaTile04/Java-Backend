package com.project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Desktop {
    @Value( "Dell" )
    String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Desktop() {
        System.out.println("Desktop object created");
    }

    public void code() {
        System.out.println("Coding on Desktop");
    }
}
