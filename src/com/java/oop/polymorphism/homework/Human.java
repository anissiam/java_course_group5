package com.java.oop.polymorphism.homework;

public class Human extends Lives{
    @Override
    public void env(String env) {
        System.out.println(env);
    }

    @Override
    public void eat(String eat) {
        System.out.println(eat);
    }
}
