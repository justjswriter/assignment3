package com.assignment3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarsInterface dao=new CarsImplement();
        System.out.println("Welcome to Cars management application");

        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Add Car\n" +
                    "2. Show All Cars\n" +
                    "3. Show Cars based on id \n" +
                    "4. Update the car\n" +
                    "5. Delete the car\n");

            System.out.println("Enter Choice: ");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    Cars car = new Cars();
                    System.out.println("Enter ID : ");
                    int id = sc.nextInt();
                    System.out.println("Enter brand : ");
                    String brand = sc.next();
                    System.out.println("Enter model: ");
                    String model = sc.next();
                    car.setId(id);
                    car.setBrand(brand);
                    car.setModel(model);

                    dao.createCars(car);
                    break;
                case 2:
                    System.out.println("thanks for using");
                    System.exit(0);
                default:
                    System.out.println("Enter valid choice");
            }
        }while(true);
    }
}
