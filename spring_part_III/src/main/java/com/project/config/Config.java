package com.project.config;

import com.project.Desktop;
import com.project.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Desktop desktop () {
        return new Desktop();
    }

    @Bean
    public Student student() {
        return new Student();
    }
}
