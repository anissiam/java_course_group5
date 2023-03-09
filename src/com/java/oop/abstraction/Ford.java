package com.java.oop.abstraction;

public class Ford extends Car{

    @Override
    public void convertSpeed() {
        System.out.println(getSpeed()/0.621371);
    }

    @Override
    public void printName() {
        System.out.println(getName());
    }

    @Override
    public int printModel() {
        return 81616 ;
    }

    @Override
    public int printModel(int x) {
        return 0;
    }

}
