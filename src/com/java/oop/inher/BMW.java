package com.java.oop.inher;

public class BMW extends Car{
    private String elecCar;

    public BMW() {
    }

    public BMW(String elecCar) {
        this.elecCar = elecCar;
    }

    public BMW(String company, double maxSpeed, String color, String elecCar) {
        super(company, maxSpeed, color);
        this.elecCar = elecCar;
    }

    public String getElecCar() {
        return elecCar;
    }

    public void setElecCar(String elecCar) {
        this.elecCar = elecCar;
    }

    @Override
    public void printData() {
        System.out.println("BMW" + "Co.:" + company + " Max Speed:" + maxSpeed  + " Elec car:"+ elecCar);
    }
}
