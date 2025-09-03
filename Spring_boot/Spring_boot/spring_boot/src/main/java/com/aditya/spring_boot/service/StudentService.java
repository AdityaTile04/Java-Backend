package com.aditya.spring_boot.service;

import com.aditya.spring_boot.model.Student;
import com.aditya.spring_boot.repository.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private LaptopRepo repo;

    public void getStudentName(Student student) {
        repo.save();
        System.out.println("Aditya");
        repo.fetch();
    }
}
