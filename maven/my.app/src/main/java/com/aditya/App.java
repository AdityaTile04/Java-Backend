package com.aditya;
import com.google.gson.*;


class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class App 
{
    public static void main(String[] args) {
        User user = new User( "Aditya", 21 );

        Gson gson = new Gson();
        String userData = gson.toJson( user );

        System.out.println(userData);
    }
}


