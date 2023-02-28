package com.java.oop.basics;

public class Person {
    String name ;
    double tall;
    int age;

    public void printData(){
        System.out.println("Name:" + name + " Age:" + age + " Tall:" +tall  );
    }

    public void printName(String name){
        System.out.println(this.name);
    }
}
