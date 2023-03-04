package com.java.oop.basics;

public class Mobile {
    String company;
    double screen;
    double price;
    String name;
    public Mobile(){

    }
    public Mobile(String company , double screen , double price , String name){
        this.company = company;
        this.name = name;
        this.price = price;
        this.screen = screen;
    }
    public void printData(){
        System.out.println("Company:" + company + " Name:" + name + " Price:" + price + "$ Screen:" + screen+ "inch");
    }
    public double covertPrice(){
        double price = (this.price * 3.63);
        return price;
    }
}
