package com.aditya;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
       Student s = new Student();
       s.setId( 102 );
       s.setName( "Rushi" );
       s.setTech( "Gen AI" );

        Configuration config = new Configuration();
        config.addAnnotatedClass( com.aditya.Student.class);
        config.configure();

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

//        Student s1 = session.get( Student.class, 102 );
//        Student s1 = session.byId( Student.class ).getReference( 102 ); // lazy loading
//        Student s1 = session.find( Student.class , 101); // Eager fetching
//        System.out.println(s1);

        Transaction transaction = session.beginTransaction();
        // updation
        session.merge( s );

        Student s2 = session.find( Student.class, 102 );
        session.remove( s2 );

        session.persist( s );

//        session.persist( s );
        transaction.commit();


    }
}