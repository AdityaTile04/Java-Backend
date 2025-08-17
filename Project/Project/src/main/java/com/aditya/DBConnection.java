package com.aditya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/Data";
    private static final String username = "root";
    private static final String password = "aditya";


    public static Connection getConnection() {
        try {
            DriverManager.getConnection( url, username, password );
        } catch (SQLException e) {
            throw new RuntimeException( e );
        }
        return null;
    }
}
