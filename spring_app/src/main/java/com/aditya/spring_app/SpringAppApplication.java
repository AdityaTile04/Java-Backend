package com.aditya.spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringAppApplication.class, args);

		Alien a = context.getBean( Alien.class );
		a.code();


	}

}
