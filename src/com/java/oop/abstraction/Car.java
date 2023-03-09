package com.java.oop.abstraction;

public abstract class Car {
    private double speed;
    private String name;
    private String model;

    public Car() {
    }

    public Car(double speed, String name, String model) {
        this.speed = speed;
        this.name = name;
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract void convertSpeed();

    public abstract void printName();

    public abstract int printModel();

    public abstract int printModel(int x);
    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
