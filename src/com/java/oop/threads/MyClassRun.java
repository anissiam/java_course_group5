package com.java.oop.threads;

import com.java.oop.basics.Person;

public class MyClassRun extends Person implements Runnable {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(getName());
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
