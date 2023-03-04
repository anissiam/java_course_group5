package com.java.oop.basics;

public class Shape {
    String name;
    int l;
    int w;


    public void printData(){
        System.out.println("Name:" + name + " Length:" + l + " width:" + w);
    }

    public int area(){
        int z = l * w;
        return z;
    }

}
