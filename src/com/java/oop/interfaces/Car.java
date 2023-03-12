package com.java.oop.interfaces;

public class Car {
    private String model;
    private double speed;

    public Car() {
    }

    public Car(String model, double speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
}
