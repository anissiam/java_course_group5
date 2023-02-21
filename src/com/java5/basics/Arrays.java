package com.java5.basics;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter the size of array");
        int size = scanner.nextInt();
        String names[] = new String[size];

        for (int i =0;i<names.length;i++){
            System.out.println("Plz enter name ");
            names[i] = scanner.next();
        }
        System.out.println("Enter the name ");
        String name = scanner.next();
        for (String ss:names){
            if(ss.equalsIgnoreCase(name)){
                System.out.println("Found");
            }
        }

        for (int i =0;i<names.length;i++){
          if(names[i].equalsIgnoreCase(name)){
              System.out.println("Plz enter the new name");
              names[i] = scanner.next();
          }
        }




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
