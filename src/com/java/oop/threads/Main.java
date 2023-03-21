package com.java.oop.threads;

public class Main {
    public static void main(String[] args) {
        MyClassRun myClassRun = new MyClassRun();
        myClassRun.setName("T1");
        Thread thread = new Thread(myClassRun);
        thread.start();



        MyClassRun myClassRun1 = new MyClassRun();
        myClassRun1.setName("T2");
        Thread thread1 = new Thread(myClassRun1);
        thread1.start();

        /*MyClass myClass = new MyClass();
        myClass.start();
        try {
            myClass.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        MyClass myClass1 = new MyClass();
        myClass1.start();


        MyClass myClass2 = new MyClass();
        myClass2.start();*/

    }
}
