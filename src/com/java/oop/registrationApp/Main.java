package com.java.oop.registrationApp;

import java.util.Scanner;

public class Main {
    static Student[] studentArray;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        studentArray = new Student[10];
        int c ;

        do {
            System.out.println("1.Add Student\n2.Show Student by id\n3.Delete Student\n4.Exit");
            c = scanner.nextInt();
            switch (c){
                case 1:
                    addStudent();
                    break;
            }
        } while (c < 4);
    }

    private static void addStudent() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Plz enter id");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Plz enter name");
        String name = scanner.nextLine();

        System.out.println("Plz enter ava");
        int ava = scanner.nextInt();

        String[] majors = {"IT", "CS", "AI", "BD"};
        for (int i = 0; i < majors.length; i++) {
            System.out.println((i+1)+ ": "+majors[i]);
        }

        System.out.println("Plz chose major");
        int i = scanner.nextInt();
        String major = majors[i - 1];
        System.out.println(major);

        Student student = new Student(id, name,ava,major);

        studentArray[id] = student;


        for (int j = 0; j < studentArray.length; j++) {
            if(studentArray[j]!=null){
                System.out.println(studentArray[j].toString());
            }
        }


    }
}
