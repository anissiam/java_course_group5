package com.java.oop.inher.homework;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(10,10);
        square.area();
        System.out.println(square.toString());

        Circle circle = new Circle(20);

        circle.area();
    }
}
