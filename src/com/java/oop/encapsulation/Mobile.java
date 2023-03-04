package com.java.oop.encapsulation;

public class Mobile {
    private String company;
    private double screen;
    private double price;
    private String name;
    public Mobile(){

    }
    public Mobile(String company , double screen , double price , String name){
        this.company = company;
        this.name = name;
        this.price = price;
        this.screen = screen;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public String getCompany(){
        return company;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void printData(){
        System.out.println("Company:" + company + " Name:" + name + " Price:" + price + "$ Screen:" + screen+ "inch");
    }
    public double covertPrice(){
        double price = (this.price * 3.63);
        return price;
    }
}
