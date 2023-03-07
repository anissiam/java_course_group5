package com.java.oop.inher;

public class Square extends Shape{

    public Square(int length, int width) {
        super(length, width);
    }

    public void printData(){
        System.out.println("Length:" + length + " Width:" + width);
    }
    public int area(){
        return length * width;
    }

    public void per(){
        System.out.println(4 * length);
    }
}
