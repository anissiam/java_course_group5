package com.java5.basics;

import java.util.Scanner;

public class IfStatment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter x ");
        int x = scanner.nextInt();

        if (x > 0) {
            System.out.println("Yes");
        }else {
            System.out.println("NO");
        }
        System.out.println("Done");


    }
}
