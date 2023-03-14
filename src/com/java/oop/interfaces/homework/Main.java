package com.java.oop.interfaces.homework;

public class Main {
    public static void main(String[] args) {
        Gclass gclass = new Gclass(5,"yes", 100);
        System.out.println(gclass.toString());
        System.out.println(gclass.solarPanel());
        gclass.chargingBatteries();

    }
}
