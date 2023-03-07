package com.java.oop.inher;

public class Ford extends Car{
    private int year;

    public Ford() {
    }

    public Ford(int year) {

        this.year = year;
    }

    public Ford(String company, double maxSpeed, String color, int year) {
        super(company, maxSpeed, color);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void printData() {
        System.out.println("Ford" + "Co.:" + company + " Max Speed:" + maxSpeed  + " year:"+ year);
    }
}
