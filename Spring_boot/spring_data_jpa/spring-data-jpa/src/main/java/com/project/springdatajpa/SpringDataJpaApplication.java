package com.project.springdatajpa;

import com.project.springdatajpa.model.Student;
import com.project.springdatajpa.repository.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
      ApplicationContext context = SpringApplication.run( SpringDataJpaApplication.class, args );

        StudentRepo repo = context.getBean( StudentRepo.class );

        Student s1 = context.getBean( Student.class );
        Student s2 = context.getBean( Student.class );
        Student s3 = context.getBean( Student.class );

        s1.setRollNo( 101 );
        s1.setName("Aditya");
        s1.setMarks( 70 );

        s2.setRollNo( 102 );
        s2.setName( "Ujjwal");
        s2.setMarks( 88 );

        s3.setRollNo( 103 );
        s3.setName( "Tejas" );
        s3.setMarks( 95 );


        repo.save( s1 );


    }

}
