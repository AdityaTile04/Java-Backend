package com.project.spring_security.controller;

import com.project.spring_security.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(
            new Student(101, "Aditya", "java"),
            new Student(102, "Gaurav", "c++"),
            new Student(103, "Kunal", "rust"),
            new Student(104, "Nikhil", "python")
    ));


    @GetMapping("csrfToken")
    public CsrfToken getToken(HttpServletRequest req) {
        return (CsrfToken) req.getAttribute( "_csrf" );
    }

    @GetMapping("students")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("students")
    public void addStudent(@RequestBody Student student) {
        students.add(student);
    }

}
