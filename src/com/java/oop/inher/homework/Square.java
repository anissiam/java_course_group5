package com.java.oop.inher.homework;

public class Square extends Shape{
    public Square() {
    }

    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public void area() {
        super.area();
        System.out.println(length*width);
    }
}
