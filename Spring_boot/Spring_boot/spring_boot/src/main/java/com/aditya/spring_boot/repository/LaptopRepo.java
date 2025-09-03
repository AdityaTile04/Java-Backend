package com.aditya.spring_boot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepo {
    public void save() {
        System.out.println("Data saved successfully");
    }

    public void fetch() {
        System.out.println("Data fetched successfully");
    }
}
