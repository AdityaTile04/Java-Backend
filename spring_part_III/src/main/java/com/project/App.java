package com.project;

import com.project.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext( Config.class);

        Desktop d = context.getBean(Desktop.class);
        d.code();

        Desktop d1 = context.getBean( Desktop.class );
        d1.code();

    }
}
