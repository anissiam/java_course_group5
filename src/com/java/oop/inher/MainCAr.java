package com.java.oop.inher;

public class MainCAr {
    public static void main(String[] args) {
        Ford ford = new Ford(2022);
        ford.printData();

        /*Ford ford1 = new Ford("Ford" , 200,"Blue", 2022);
        System.out.println(ford1.color);*/
        BMW bmw = new BMW("BMW" , 250, "BLACK" , "YES");
        bmw.printData();
    }
}
