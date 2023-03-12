package com.java.oop.interfaces;

public class Clarck extends Person implements SuperHero{
    private String major;

    public Clarck() {
    }

    public Clarck(String major) {
        this.major = major;
    }

    public Clarck(String name, int tall, int age, String major) {
        super(name, tall, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Clarck{" +
                "major='" + major + '\'' +
                '}';
    }

    @Override
    public void fly() {
     System.out.println("Fly");
    }

    @Override
    public void speed() {
        System.out.println("Speed");
    }
}
