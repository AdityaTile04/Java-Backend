package com.aditya;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentApp {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.setLid( 2 );
        laptop.setBrand( "Asus" );
        laptop.setModel( "Vivobook" );
        laptop.setG_card( "RTX3050" );
        laptop.setPrice( 700000 );

        StudentDetails sd = new StudentDetails();
        sd.setId( 104 );
        sd.setName( "Kunal" );
        sd.setAge( 22 );
        sd.setLaptop( laptop );

        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass( com.aditya.StudentDetails.class )
                .addAnnotatedClass( com.aditya.Laptop.class )
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist( laptop );
        session.persist( sd );
        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
