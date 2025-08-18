package com.aditya;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {
    public static void main(String[] args) {
        Employee e = null;

        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass( com.aditya.Employee.class )
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        e = session.get(Employee.class, 109);
        session.remove( e );
        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
