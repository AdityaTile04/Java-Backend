package com.aditya;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentApp {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.setBrand( "Apple" );
        laptop.setModel( "Macbook Air M3" );
        laptop.setG_card( "None" );
        laptop.setPrice( 160000 );

        StudentDetails sd = new StudentDetails();
        sd.setId( 103 );
        sd.setName( "Rushi Rajapure" );
        sd.setAge( 22 );
        sd.setLaptop( laptop );

        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass( com.aditya.StudentDetails.class )
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist( sd );
        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
