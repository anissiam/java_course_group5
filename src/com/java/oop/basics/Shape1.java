package com.java.oop.basics;

public class Shape1 {
    String name;
    int l;
    int w;

    public Shape1(){

    }

    public Shape1(String name){
        this.name = name;
    }

    public Shape1( String name, int l , int w){
        this.name = name;
        this.l = l;
        this.w = w;
    }
    public void printData(){
        System.out.println("Name:" + name + " Length:" + l + " width:" + w);
    }

    public int area(){
        int z = l * w;
        return z;
    }

}
