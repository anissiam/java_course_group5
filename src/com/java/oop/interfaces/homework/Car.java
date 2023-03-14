package com.java.oop.interfaces.homework;

public class Car {
    private int size;
    private String control;
    private int speed;

    public Car() {
    }

    public Car(int size, String control, int speed) {
        this.size = size;
        this.control = control;
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "size=" + size +
                ", control='" + control + '\'' +
                ", speed=" + speed +
                '}';
    }
}
