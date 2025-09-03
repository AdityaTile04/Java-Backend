package com.project.spring_jdbc.service;

import com.project.spring_jdbc.model.Student;
import com.project.spring_jdbc.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepo studentRepo;

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void addStudent(Student student) {
        studentRepo.save( student );
    }

    public List<Student> getStudent() {
        return studentRepo.findAll();
    }

}
