package com.project.config;

import com.project.Desktop;
import com.project.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.project")
public class Config {

//
//    @Bean
//    public Desktop desktop () {
//        Desktop d = new Desktop();
//        d.setBrand( "Dell" );
//        return d;
//    }
//
//    @Bean
//    public Student student() {
//        Student s = new Student();
//        s.setAge( 21 );
//        return s;
//    }
}
