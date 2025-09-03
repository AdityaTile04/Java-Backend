package com.project.springdatajpa;

import com.project.springdatajpa.model.Student;
import com.project.springdatajpa.repository.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
      ApplicationContext context = SpringApplication.run( SpringDataJpaApplication.class, args );

        StudentRepo repo = context.getBean( StudentRepo.class );

        Student s1 = context.getBean( Student.class );


        s1.setRollNo( 101 );
        s1.setName("Aditya");
        s1.setMarks( 90 );

        repo.save( s1 );
        repo.delete(s1);
    }

}
