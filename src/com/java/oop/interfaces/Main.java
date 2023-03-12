package com.java.oop.interfaces;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW("BMW 2023", 200.0);
        bmw.convertSpeed();
        bmw.battarySize();
        bmw.charge();
        System.out.println(bmw.iSAI());
       /* Clarck clarck = new Clarck();
        clarck.fly();
        clarck.speed();
        System.out.println(clarck.toString());

        Batman batman = new Batman();
        batman.fly();*/

    }
}
