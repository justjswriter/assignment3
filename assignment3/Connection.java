package com.assignment3;

import java.sql.DriverManager;

public class Connection {
    static Connection con;
    public static Connection createConnection(){

        try{
            Class.forName("com.mysql.Driver");
            String url="";
            String username="assignment3";
            String password="admin";
            DriverManager.getConnection(url,username,password);
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return con;

    }
}
