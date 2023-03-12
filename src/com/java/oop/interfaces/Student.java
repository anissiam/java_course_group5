package com.java.oop.interfaces;

public class Student extends Person implements Collage{
    private double ava;

    public Student() {

    }

    public Student(double ava) {
        this.ava = ava;
    }

    public Student(String name, int tall, int age, double ava) {
        super(name, tall, age);
        this.ava = ava;
    }

    public double getAva() {
        return ava;
    }

    public void setAva(double ava) {
        this.ava = ava;
    }

    @Override
    public void hourCount() {

    }

    @Override
    public double hourPrice() {
        return 0;
    }
}
