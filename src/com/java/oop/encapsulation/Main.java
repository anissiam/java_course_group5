package com.java.oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        Mobile mobile =  new Mobile("Samsung" , 6.7  ,400 ,"A21s" );
        mobile.printData();

        System.out.println(mobile.getCompany());
        mobile.setCompany("Apple");
        System.out.println(mobile.getCompany());
        mobile.setName("14 pro max");
        System.out.println(mobile.getName());
        mobile.printData();

    }
}
