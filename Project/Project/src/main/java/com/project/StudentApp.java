package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();
            if(con == null) {
                System.out.println("Database connection failed");
                return;
            }

        Scanner sc = new Scanner( System.in );
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Roll No: ");
        int roll_no = sc.nextInt();

        PreparedStatement ps = con.prepareStatement( "insert into students (name, roll_no) values (?,?)" );
        ps.setString( 1, name );
        ps.setInt( 2, roll_no );
        int ar = ps.executeUpdate();
        if(ar > 0) {
            System.out.println("Student Insertion Successful");
        } else {
            System.out.println("Student Insertion Failed!");
        }

        } catch (Exception e) {
            throw new RuntimeException( e );
        }

    }
}
