package com.java.oop.threads;

public class MyClass extends Thread{
    @Override
    public void run() {
        super.run();
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
