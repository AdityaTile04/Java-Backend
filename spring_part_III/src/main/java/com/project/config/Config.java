package com.project.config;

import com.project.Desktop;
import com.project.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {


    @Bean()
    @Scope("prototype")
    public Desktop desktop () {
        return new Desktop();
    }

    @Bean(name = "student1")
    public Student student() {
        return new Student();
    }
}
