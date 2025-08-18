package com.aditya;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId( 110 );
        e.setName( "Yogesh" );
        e.setEmail( "yogesh@gmail.com" );
        e.setSalary( 40000 );


        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass( com.aditya.Employee.class )
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.merge( e );
        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
