package com.java.oop.inher;

public class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    public void printData(){
        System.out.println("Length:" + length + " Width:" + width);
    }
    public int area(){
        return length * width;
    }

    public void per(){
        System.out.println((2*(length+width)));
    }
}
