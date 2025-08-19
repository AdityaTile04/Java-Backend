package com.aditya;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class StudentApp {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.setLid( 5 );
        laptop.setBrand( "HP" );
        laptop.setModel( "Victus" );
        laptop.setG_card( "GTX1015" );
        laptop.setPrice( 70000 );

        Laptop laptop2 = new Laptop();
        laptop2.setLid( 4 );
        laptop2.setBrand( "Dell" );
        laptop2.setModel( "Alienware" );
        laptop2.setG_card( "RTX4050" );
        laptop2.setPrice( 140000 );


        StudentDetails sd = new StudentDetails();
        sd.setId( 105 );
        sd.setName( "gaurav" );
        sd.setAge( 22 );
        sd.setLaptops( Arrays.asList( laptop, laptop2 ) );

        laptop.setStudentDetails( sd );
        laptop2.setStudentDetails( sd );

        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass( com.aditya.StudentDetails.class )
                .addAnnotatedClass( com.aditya.Laptop.class )
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist( laptop );
        session.persist( laptop2 );
        session.persist( sd );
        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
