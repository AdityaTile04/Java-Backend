package com.aditya.spring_boot.service;

import com.aditya.spring_boot.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void add(Laptop laptop) {
        System.out.println("Method called...");
    }

    public boolean isGoodForProgramming() {
        return true;
    }
}
