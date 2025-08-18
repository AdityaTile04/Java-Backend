package com.aditya;

import com.mysql.cj.jdbc.ConnectionGroupManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentApp {
    public static void main(String[] args) {
        StudentDetails sd = new StudentDetails();
        sd.setId( 101 );
        sd.setName( "Tejas" );
        sd.setAge( 22 );

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
