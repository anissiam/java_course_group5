package com.java.oop.polymorphism;

public class Rectangle extends Shape{
    @Override
    public void area(int length, int width) {
        System.out.println(length * width);
    }
}
