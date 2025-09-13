package com.project.spring_oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringOAuth2Application {

    public static void main(String[] args) {
        SpringApplication.run( SpringOAuth2Application.class, args );
        System.out.println("Application Started");
    }

}
