package com.project;

import com.project.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext( Config.class);

        Desktop d = context.getBean( Desktop.class );
        d.code();

        Student s = context.getBean( Student.class );
        s.printName();

    }
}
