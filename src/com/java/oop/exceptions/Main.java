package com.java.oop.exceptions;

import com.java.oop.basics.Person;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Person person;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nums[] = new int[5];

        try {
            nums[5] = 30/0;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (ArithmeticException e){
            System.out.println(e);
        }

       /* try {

            System.out.println("Plz enter num");
            int num = scanner.nextInt(); // Throw
             person.printData();


        }catch (NullPointerException e){
            System.out.println(e);
            person = new Person();
            person.printData();
           // return;
        }catch (InputMismatchException e){
            System.out.println(e);
        }finally {
            System.out.println("Finally");
        }*/

        System.out.println("Done");

    }
}
