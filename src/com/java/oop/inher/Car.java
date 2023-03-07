package com.java.oop.inher;

public class Car {
    String company;
    double maxSpeed;
    String color;

    public Car() {
    }

    public Car(String company, double maxSpeed, String color) {
        this.company = company;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }
    public void printData(){
       System.out.println("Car");
    }
}
