package com.aditya.spring_boot;

import com.aditya.spring_boot.model.Laptop;
import com.aditya.spring_boot.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

		LaptopService laptopService = context.getBean( LaptopService.class );

		Laptop laptop = context.getBean( Laptop.class );
		laptopService.add( laptop );
	}

}
