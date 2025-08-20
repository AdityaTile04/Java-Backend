package com.project;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass( com.project.Laptop.class )
                .configure()
                .buildSessionFactory();

        Session session = sessionFactory.openSession();

        String brand = "Apple";

        Query q = session.createQuery( "from Laptop where brand = ?1" );
        q.setParameter( 1, brand );
        List<Laptop> laptops = q.getResultList();
        System.out.println(laptops);

        session.close();
        sessionFactory.close();
    }
}