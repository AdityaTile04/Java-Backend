package com.aditya;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class StudentApp {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.setLid( 1 );
        laptop.setBrand( "HP" );
        laptop.setModel( "Victus" );
        laptop.setG_card( "GTX1015" );
        laptop.setPrice( 70000 );

        Laptop laptop2 = new Laptop();
        laptop2.setLid( 2 );
        laptop2.setBrand( "Dell" );
        laptop2.setModel( "Alienware" );
        laptop2.setG_card( "RTX4050" );
        laptop2.setPrice( 140000 );

        Laptop laptop3 = new Laptop();
        laptop3.setLid( 3 );
        laptop3.setBrand( "Lenovo" );
        laptop3.setModel( "Ideapad" );
        laptop3.setG_card( "RTX3050" );
        laptop3.setPrice( 60000 );


        StudentDetails sd = new StudentDetails();
        sd.setId( 1 );
        sd.setName( "gaurav" );
        sd.setAge( 22 );
        sd.setLaptops( Arrays.asList( laptop, laptop2 ) );


        StudentDetails sd1 = new StudentDetails();
        sd1.setId( 2 );
        sd1.setName( "rohit" );
        sd1.setAge( 24 );

        StudentDetails sd2 = new StudentDetails();
        sd2.setId( 3 );
        sd2.setName( "ujjwal" );
        sd2.setAge( 22 );


    sd.setLaptops( Arrays.asList( laptop, laptop2 ) );
    sd1.setLaptops( Arrays.asList( laptop2, laptop3 ) );
    sd2.setLaptops( Arrays.asList( laptop3 ) );

    laptop.setStudentDetails( Arrays.asList( sd, sd2 ) );
    laptop2.setStudentDetails( Arrays.asList( sd2 ) );
    laptop3.setStudentDetails( Arrays.asList( sd1 ) );

        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass( com.aditya.StudentDetails.class )
                .addAnnotatedClass( com.aditya.Laptop.class )
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist( laptop );
        session.persist( laptop2 );
        session.persist( laptop3 );
        session.persist( sd );
        session.persist( sd1 );
        session.persist( sd2 );
        transaction.commit();
        session.close();
        sessionFactory.close();

    }
}
