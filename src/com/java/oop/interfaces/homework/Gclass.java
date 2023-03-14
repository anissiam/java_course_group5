package com.java.oop.interfaces.homework;

public class Gclass  extends Car implements SolarPanel{
    public Gclass() {
    }

    public Gclass(int size, String control, int speed) {
        super(size, control, speed);
    }
    @Override
    public void chargingBatteries() {
        System.out.println("Yes");
    }

    @Override
    public int solarPanel() {
        return 1;
    }
}
