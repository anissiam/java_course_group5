package com.java5.basics;

public class Main {
    static int x;  // Global
    static double ww;
    static boolean bb;

    public static void main(String[] args) {


        int xy = 10; //32 bit

        double yy = xy; // 64 bit

        long ll = (int)yy; // LL = 64  , yy 64

        byte bbb = (byte) yy; // 8  , yy 64

        System.out.println(xy = xy + 3);
        System.out.println(xy);

        System.out.println(x);
        int xx = 1;

        System.out.println(xx);
        System.out.println(xx + 1);
        xx = xx + 1;
        System.out.println(xx);


        System.out.println(10 % 2);


       /* int xx= 5;
        int yy = 3;
        double zz = 50;

        double result = (xx + yy + zz) / 3;
        System.out.println(result);
        */

    /*    System.out.println(bb);

        double ww;
        double d = 50.0;
        System.out.println(d);
        float f = 13.5f;
        System.out.println(f);

        boolean b = true;
        System.out.println(b);

        char c = 'A';

        System.out.println((byte)'A');


        short ss = 50;

        int zz = ss;

        double dd = zz;
        System.out.println(dd);

        long qq =(int)dd;
        System.out.println(qq);


*/


        //System.out.println((byte)zz);


        //int x, y;

       /* System.out.println(x);
        int x = 10;
        System.out.println(x);*/

        /*int x;
        System.out.println(x);*/
        // int y; //Local
        // y = 10;

        int w = 50;
        //System.out.println(y);









        /*//هذا السطر يعمل على طباعة الاسم من خلال println
        System.out.println("Anis"); //sadsadsadad
        //System.out.println("Anis");
        *//*
           Multiple line of comment
           zdf

           x
           xzc
           zx
           cx
           c
         *//*
        System.out.println("Anis");
        System.out.println("Anis");
        System.out.println("Anis");*/


        int x = 10;   // Data type int , var name = x , value 10 , size 32bit
        int y;


        y = 30;
        System.out.println(y);

        System.out.println("x =" + x);

        x = 50;
        System.out.println("x =" + x);

    }

    public void test() {
        int xx = 0;
        // System.out.println(y);
        System.out.println(x);

    }
}
