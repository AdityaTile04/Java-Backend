package com.project.spring_jdbc;

import com.project.spring_jdbc.model.Student;
import com.project.spring_jdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Student s = context.getBean( Student.class );
		s.setRollNo( 106 );
		s.setName( "Aditya" );
		s.setMarks( 95 );

		StudentService service = context.getBean( StudentService.class );
		service.addStudent( s );

		List<Student> list = service.getStudent();
		for(Student student: list) {
			System.out.println(student.getRollNo() + " | " + student.getName() + " | " + student.getMarks());
		}

	}

}
