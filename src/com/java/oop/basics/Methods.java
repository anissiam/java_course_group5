package com.java.oop.basics;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x:");
        int x = scanner.nextInt();
        System.out.println("y:");
        int y = scanner.nextInt();
        add1(x, y);
        sub1(x, y);
        /*int v = 200;
        add1(v, 20);*/
        /*add();
        sub();*/
    }
    public static void add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("x:");
        int x = scanner.nextInt();
        System.out.println("y:");
        int y = scanner.nextInt();
        int z = x + y;
        System.out.println(z);
    }

    public static void sub(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("x:");
        int x = scanner.nextInt();
        System.out.println("y:");
        int y = scanner.nextInt();
        int z = x - y;
        System.out.println(z);
    }


    public static void add1(int x, int y){
        int z = x + y;
        System.out.println(z);
    }

    public static void sub1(int x, int y){

        int z = x - y;
        System.out.println(z);
    }
}
