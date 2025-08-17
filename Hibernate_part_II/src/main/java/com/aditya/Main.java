package com.aditya;

import com.mysql.cj.xdevapi.SessionImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId( 103 );
        e.setName("Kunal");
        e.setEmail( "Kunal@gmail.com" );
        e.setSalary(65000);
        System.out.println(e);

        Configuration config = new Configuration();
        config.addAnnotatedClass( com.aditya.Employee.class );
        config.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist( e );
        transaction.commit();




    }
}