package com.aditya;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
    public static void main(String[] args) {
        Employee e = null;

        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass( com.aditya.Employee.class )
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        e = session.get(Employee.class, 101);
        System.out.println(e);

        session.close();
        sessionFactory.close();
    }
}
