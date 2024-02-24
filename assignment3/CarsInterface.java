package com.assignment3;

public interface CarsInterface {
    public void createCars(Cars car);
    public void showAllCars();
    public void showCarsBasedOnID(int id);
    public void updateCars(int id,String name);
    public void deleteCars(int id);
}
