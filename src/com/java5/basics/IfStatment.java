package com.java5.basics;

import java.util.Scanner;

public class IfStatment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz enter num");
        int mark = scanner.nextInt();
        /*// البرنامج يبحث عن mark
        switch (mark) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            default:
                System.out.println("not correct to add " + mark);

        }*/

        /*if(mark==1){
            System.out.println("1");
        }else if(mark==2 || mark==3){
            System.out.println("2 OR 3");
        }else {
            System.out.println(mark);
        }*/

        switch (mark) {
            case 1:
                System.out.println("1");
                break;
            case 2:
            case 3:
                System.out.println("2 Or 3");
                break;
            default:
                System.out.println(mark);
        }

        /*if (mark == 1) {
            System.out.println("1");
        } else if (mark == 2) {
            System.out.println("2");
        } else if (mark == 3) {
            System.out.println("3");
        } else if (mark == 4) {
            System.out.println("4");
        } else if (mark == 5) {
            System.out.println("5");
        } else if (mark == 6) {
            System.out.println("6");
        }else {
            System.out.println("not correct to add " + mark);
        }*/
        /*System.out.println("Plz enter Line ");
        String line = scanner.nextLine();*/
      /*  if(line.isEmpty()){
            System.out.println("Line is empty");
            return;
        }
*/
       /* if(!line.isEmpty()&& line.contains("https://")){
            System.out.println("URL");
        }else if(!line.isEmpty() &&line.contains("@")){
            System.out.println("Email");
        }else {
            System.out.println("not email or URL");
        }*/
        /*System.out.println("Plz enter mark ");
        int mark = scanner.nextInt();

        if(mark>0 && mark%2==0){
            System.out.println("Up to 0 and even");
        }else if(mark>0 && mark%2!=0){
            System.out.println("Up  to 0 and Odd ");
        }else {
            System.out.println("Less than 0 ");
        }
*/


        /* int mark = scanner.nextInt();
        if(mark>6 || mark<1){
            System.out.println("not correct to add " +mark);
            return;
        }*/

        /*if(mark>6){
            System.out.println("not correct to add " +mark);
            return;
        }

        if(mark<1){
            System.out.println("not correct to add " +mark);
            return;
        }*/

        /*if (mark == 1) {
            System.out.println("1");
        } else if (mark == 2) {
            System.out.println("2");
        } else if (mark == 3) {
            System.out.println("3");
        } else if (mark == 4 || mark == 5) {
            System.out.println("4 OR 5");
        }  else if (mark == 6) {
            System.out.println("6");
        }*//*else {
            System.out.println("not correct to add " + mark);
        }*/


       /* if(mark>100){
            System.out.println("not valid");
            return;
        }

        if(mark>=90){
            System.out.println("Up to 90");
        }else if(mark>=80){
            System.out.println("up to 80");
        } else if(mark>=70){
            System.out.println("UP to 70");
        }else if(mark>=60){
            System.out.println("UP to 60");
        }else {
            System.out.println("Less than 60");
        }

*/
        /*System.out.println("Plz enter number ");
        int number = scanner.nextInt();

        if(number==0){
            System.out.println("number equal to 0 ");
            return;
        }*/

        /*if(number>0 ){
            if(number%2==0){
                System.out.println("Up to 0 and Even");
            }else {
                System.out.println("Up to 0 and Odd");
            }
        }else if(number<0){
            System.out.println("Less than 0");
        } else  {
            System.out.println("number equal to 0 ");
        }*/



        /*System.out.println("Plz enter x ");
        int x = scanner.nextInt();

        if (x > 0) {
            System.out.println("Yes");
        }else {
            System.out.println("NO");
        }
        System.out.println("Done");*/


    }
}
