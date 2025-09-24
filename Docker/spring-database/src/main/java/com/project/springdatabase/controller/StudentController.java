package com.project.springdatabase.controller;

import com.project.springdatabase.model.Student;
import com.project.springdatabase.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    @RequestMapping("/addStudent")
    public void addStudent() {
        Student student = new Student();
        student.setName( "Nikhil" );
        student.setMarks( 88 );
        repo.save( student );
    }

}
