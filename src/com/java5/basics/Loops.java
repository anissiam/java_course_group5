package com.java5.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*for(int i = 0 ; i <5 ; i++){
            for (int j = 0 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

       /* for (int i = 1 ; i<=4 ; i++){
            System.out.println("Week " + i );
            for(int j = 1 ; j<=7 ; j++){
                System.out.print("Day " + j + "  ");
            }
            System.out.println();
        }*/


        /*Scanner scanner = new Scanner(System.in);
        for(;;){
            System.out.println("Plz enter the num ");
            int num = scanner.nextInt();
            if(num==0){
                System.out.println("App Stopped");
                continue;
            }
            if(num%2==0){
                System.out.println("Even");
            }else {
                System.out.println("Odd");
            }

        }*/

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter the num ");
        int num = scanner.nextInt();
        int fact = 1;
        for(int i = 1 ; i <=num;  i++){
            fact *= i;
        }
        System.out.println(fact);*/

        /*int sum = 0;
        for(int i = 0 ; i<=100 ; i++){
            if(i%2==0){
                sum += i;
            }
        }
        System.out.println(sum);*/

        /*for(int i = 1 ; i<10 ; i++){
            if(i!=9){
                System.out.print("1/" + i + "+");
            }else {
                System.out.print("1/" + i );
            }
        }
*/
        /*for(int i = 0  ; i<3;i++){
           for(int j = 0 ; j<3 ; j++){
               System.out.print("*");
           }
           System.out.println();
        }
*/
        /*Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        int i = 0;
        for( ; i <5 ; i++){
            System.out.println("Plz enter the num");
            num = scanner.nextInt();
            sum += num;
        }
        System.out.println(sum/i);*/


        /*int i = 0;
        for (; i < 100; ) {
            i += 2;
            System.out.println(i);
        }
*/
        /*int fact = 1;
        for (int i = 7; i > 1; i--) {
            fact *= i; // fact = fact*i
        }
        System.out.println("Fact is " + fact);*/

        /*Scanner scanner = new Scanner(System.in);
        int num;
        int max = 0;
        int min = 0;
        int sum=0;
        for(int i = 0;i<5;i++){
            System.out.println("Plz enter num");
            num = scanner.nextInt(); //5 //10 //2
            if(i==0){
                max = num;  //5
                min = num;  //5
            }
            if(max<num){
                max = num;
            }
            if(min>num){
                min = num;
            }
            sum += num;
        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);
        System.out.println("Sum is " + sum);*/

        /*Scanner scanner = new Scanner(System.in);
        int num;
        for(;;){
            System.out.println("Plz enter num");
            num = scanner.nextInt();
            if (num > 100) {
                System.out.println("App Stopped");
                break;
            }
        }
*/

        /*for(int i = 0; i<5;i++){
            System.out.println(i);
        }*/


        /*int i = 100;
        while (i>=0){
            System.out.println(i);
            i--;
        }
*/

        /*Scanner scanner = new Scanner(System.in);
        String word;
        while (true){
            System.out.println("Plz enter word");
            word = scanner.nextLine();
            if (word.equalsIgnoreCase("Stop")) {
                System.out.println("App is stopped");
                break;
            }
        }*/


        /*Scanner scanner = new Scanner(System.in);
        int num;
        int i = 0;
        int sum = 0;
        while (i < 5) {
            System.out.println("Plz enter num");
            num = scanner.nextInt();
            sum = sum + num;
            i++;
        }
        System.out.println(sum / i);*/



        /*int i = 0;
        while (i < 5) {
            i++;

            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }*/

        /*Scanner scanner = new Scanner(System.in);
        int num;
        int i = 0;
        while (true){
            System.out.println("Plz enter number");
            num = scanner.nextInt();
            if(num==0){
                break;
            }
        }*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter number");
        int num = scanner.nextInt();

        while (num!=0){
            System.out.println("Plz enter new number");
            num = scanner.nextInt();

        }*/


        /*int ii = 5;
        while (ii<=5){
            System.out.println("Hello");
            ii++;
        }*/
        /*int iii = 5;
        do {
            System.out.println("Hello");
            iii++;
        }while (iii<=5);*/


        /*System.out.println("Hello");//0 i = 0
        System.out.println("Hello");//1
        System.out.println("Hello");//2
        System.out.println("Hello");//3
        System.out.println("Hello");//4  i<5*/

        /*int i = 0;
        while (i<5){
            System.out.println("Hello" + " i = " + i);
            i++;
        }*/

        /*int i = 0;
        while (i <= 100) {

            if (i % 2 != 0) {
                System.out.println("i={" + i + "}");
            }
            i++;
        }*/
        /*int i = 0;
        while (i < 100) {
            i += 2; // i = i+2
            System.out.println("i={" + i + "}");
        }*/

        /*int i = 0;
        while (i < 100) {
            i += 2;
            System.out.println("i={" +( i-1) + "}");
        }*/
        /*int i = 1;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }*/
        /*int i = 0;
        int sum = 0;
        while (i <= 5) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum = " + sum);*/
    }
}
