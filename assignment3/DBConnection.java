package com.assignment3;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static Connection con;
    public static Connection createDBConnection(){

        try{
            String url="jdbc:postgresql://localhost:5432/assignment3";
            String username="postgres";
            String password="admin";
            con = DriverManager.getConnection(url,username,password);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return con;

    }
}
