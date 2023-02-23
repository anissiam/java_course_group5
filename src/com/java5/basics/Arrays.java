package com.java5.basics;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        String[][] month = {{"Sat", "Sun" , "Mon" , "Tue" , "Wen" , "Thr","Fri"},
                {"Sat", "Sun" , "Mon" , "Tue" , "Wen" , "Thr","Fri"},
                {"Sat", "Sun" , "Mon" , "Tue" , "Wen" , "Thr","Fri"},
                {"Sat", "Sun" , "Mon" , "Tue" , "Wen" , "Thr","Fri"}};
        System.out.println(month.length); //
        System.out.println(month[0].length);
        System.out.println(month[0][0]);
        for (int i = 0; i < month.length; i++) {
            System.out.println("Week " + (i + 1));
            for (int j = 0; j < month[i].length; j++) {
                System.out.print(month[i][j] +" ");
            }
            System.out.println();
        }
        //int[][] arr = new int[4][4];
        /*int[][] arr = {{5,10,5}, {2,7,8, 5}, {9,7,3}};
        System.out.println(arr.length); // عدد الصفوف
        System.out.println(arr[0].length); // عدد الاعمدة في الصف الاول او عند ال i = 0

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/


        /*String[] arr1 = {"ALi", "Sami", "Nes", "Anis"};
        String[] arr2 = {"Fadi", "Ahmed", "Adel", "Ali"};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i].equals(arr2[j])){
                    System.out.println(arr1[i] + " Found");
                }
            }
        }*/


       /* Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];

        int max = 0;
        int min = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Plz enter num[" + i+ "]");
            nums[i]= scanner.nextInt();
            if(i==0){
                max = nums[0];
                min = nums[0];
                continue;
            }
            if(max<nums[i]){
                max = nums[i];
            }

            if(min>nums[i]){
                min = nums[i];
            }
        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);


        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                System.out.println("Not even nor odd ");
                continue;
            }
            if(nums[i]%2==0){
                System.out.println(nums[i] + " is even");
            }else {
                System.out.println(nums[i] + " is Odd");
            }
        }
        System.out.println("Search for: ");
        int s = scanner.nextInt();

        int count = 0;  //
        for (int x :nums) {
           if(x==s){
               System.out.println(x+  " is Found");
               System.out.println("plz enter new num");
               nums[count] = scanner.nextInt();
               break;
           }
            count++;
        }
        for (int x: nums) {
            System.out.println(x);
        }*/

          /*for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }*/


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter the size of array");
        int size = scanner.nextInt();
        String names[] = new String[size];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Plz enter name ");
            names[i] = scanner.next();
        }
        System.out.println("Enter the name ");
        String name = scanner.next();
        for (String ss : names) {
            if (ss.equalsIgnoreCase(name)) {
                System.out.println("Found");
            }
        }

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                System.out.println("Plz enter the new name");
                names[i] = scanner.next();
            }
        }*/


        //String ss = names[1];
        /*for(int i = 0 ; i<names.length; i++){
         *//*System.out.println(names[i]);*//*
            if (names[i].equalsIgnoreCase("Anis")){
                System.out.println("Found");
                break;
            }
        }*/

        /*int[] nums = {10, 50, 80, 2, 7};
        for (int x :nums) {
            System.out.println(x);
        }*/
        /*int[] nums = new int[5];
        System.out.println(nums.length);
        System.out.println(nums[0]);
        System.out.println(nums[2]);
        nums[0] = 10;
        System.out.println(nums[0]);
        nums[1] = nums[0];
        System.out.println(nums[1]);*/

        /*for(int i = 0  ; i <5 ; i++){
            System.out.println("Arr " + nums[i]);
        }*/


        /*for (int x:nums){
            System.out.println(x );
        }*/

        //System.out.println(nums[5]);
        //System.out.println(nums[-1]);

    }
}
