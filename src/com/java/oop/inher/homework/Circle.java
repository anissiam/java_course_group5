package com.java.oop.inher.homework;


public class Circle extends Shape {
    private final double PI = 3.14;

    public Circle() {
    }

    public Circle(double rad) {
        super(rad);
    }

    @Override
    public void area() {
        super.area();
        System.out.println(PI * (rad * rad));
    }
}
