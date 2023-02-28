package com.java.oop.basics;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

        add1(10,10);
        add1("10","10");

        /*Scanner in = new Scanner(System.in);
        System.out.println("Plz enter name");
        String name = in.nextLine();

        System.out.println( getFirstChar(name));*/



        /*Scanner scanner = new Scanner(System.in);
        System.out.println("x:");
        int x = scanner.nextInt();
        System.out.println("y:");
        int y = scanner.nextInt();

       // System.out.println(div(x, y));
        System.out.println("1)Add\n2)Sub\n3)Multi\n4)Div\n5)Exit");
        int c = scanner.nextInt();
        switch (c){
            case 1 :
                add1(x, y);  break;
            case 2 :
                sub1(x, y);  break;
            case 3 :
                multi(x, y);  break;
            case 4 :
                System.out.println(div(x, y));
               break;
            case 5 :
                System.exit(0);
        }*/

        /*add1(x, y);
        sub1(x, y);*/



        /*int v = 200;
        add1(v, 20);*/
        /*add();
        sub();*/
    }
    public static char getFirstChar(String name){
        char c = name.charAt(0);
        return c;
    }
    public static void getFirstChar() {
        Scanner in = new Scanner(System.in);
        System.out.println("Plz enter name");
        String name = in.nextLine();
        System.out.println(name.charAt(0));
    }


    /*public static void getFirstChar(String name) {


       System.out.println(name.charAt(0));
   }*/
    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x:");
        int x = scanner.nextInt();
        System.out.println("y:");
        int y = scanner.nextInt();
        int z = x + y;
        System.out.println(z);
    }

    public static void sub() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x:");
        int x = scanner.nextInt();
        System.out.println("y:");
        int y = scanner.nextInt();
        int z = x - y;
        System.out.println(z);
    }


    public static void add1(int x, int y) {

        int z = x + y;
        System.out.println(z);
    }

    public static void add1(String x, String y) {
        String z = x + y;
        System.out.println(z);
    }

    public static void add1(String x, String y , int q) {
        String z = x + y;
        System.out.println(z);
    }
    public static void add1() {
        System.out.println("Add");
    }
    public static void sub1(int x, int y) {

        int z = x - y;
        System.out.println("Sub is " + z);
    }

    public static void multi(int w, int z) {
        System.out.println(w * z);

    }

    public static double div(int x, int y) {
        double z = 0.0;
        if (y != 0) {
            z = x / y;
        }
        return z;
    }


}
