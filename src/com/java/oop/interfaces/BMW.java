package com.java.oop.interfaces;

public class BMW extends Car implements ElectCar1, SunCharging{
    public BMW() {
    }

    public BMW(String model, double speed) {
        super(model, speed);
    }

    void convertSpeed(){
        System.out.println(getSpeed()/0.621);
    }

    @Override
    public void battarySize() {
        System.out.println(5000);
    }

    @Override
    public boolean iSAI() {
        return true;
    }

    @Override
    public void charge() {
        System.out.println("Charging");
    }

    @Override
    public void power() {

    }
}
