package com.aditya;

import com.mysql.cj.xdevapi.SessionImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId( 108 );
        e.setName("rohit");
        e.setEmail( "rohit@gmail.com" );
        e.setSalary(30000);


//        Configuration config = new Configuration();
//        config.addAnnotatedClass( com.aditya.Employee.class );
//        config.configure("hibernate.cfg.xml");


         // Inserting Data
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass( com.aditya.Employee.class )
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist( e );
        System.out.println(e);

        transaction.commit();

        session.close();
        sessionFactory.close();


    }
}