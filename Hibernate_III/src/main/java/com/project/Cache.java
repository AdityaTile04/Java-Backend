package com.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Cache {
    public static void main(String[] args) {


        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass( com.project.Laptop.class )
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        Laptop l1 = session.get(Laptop.class, 2);
        System.out.println(l1);


        session.close();

        Session session1 = sessionFactory.openSession();

        Laptop l2 = session.get(Laptop.class, 2);
        System.out.println(l2);

    }
}
