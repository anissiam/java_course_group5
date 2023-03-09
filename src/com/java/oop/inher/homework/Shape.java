package com.java.oop.inher.homework;

public class Shape {
    double length;
    double width;
    double rad;

    public Shape() {
    }

    public Shape(double rad) {
        this.rad = rad;
    }

    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Shape(double length, double width, double rad) {
        this.length = length;
        this.width = width;
        this.rad = rad;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }
    public void area(){
        System.out.print("The area is:");
    }

    @Override
    public String toString() {
        return "Shape{" +
                "length=" + length +
                ", width=" + width +
                ", rad=" + rad +
                '}';
    }
}
