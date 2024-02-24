package com.assignment3;

import java.sql.Connection;

public class CarsImplement implements CarsInterface{
    Connection con;
    @Override
    public void createCars(Cars car){
        con = DBConnection.createDBConnection();
        String query = "insert into cars values()";
    }

    @Override
    public void showAllCars(){

    }
    @Override
    public void showCarsBasedOnID(int id){

    }
    @Override
    public void updateCars(int id,String name){

    }
    @Override
    public void deleteCars(int id){

    }


}
