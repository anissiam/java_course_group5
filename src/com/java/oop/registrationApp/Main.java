package com.java.oop.registrationApp;

import java.util.Scanner;

public class Main {
    static Student[] studentArray;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        studentArray = new Student[10];
        int c ;

        do {
            System.out.println("==========================Main menu==========================");
            System.out.println("1.Add Student\n2.Show Student by id\n3.Delete Student\n4.Show all\n5.Exit");
            c = scanner.nextInt();
            switch (c){
                case 1:
                    addStudent();
                    break;
                case 2:
                    showStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    showAll();
                    break;
                default:
                    break;
            }
        } while (c < 5);
    }

    private static void showAll() {
        for (int i = 0; i < studentArray.length; i++) {
            if(studentArray[i]!=null){
                System.out.println(studentArray[i]);
            }
        }
    }

    private static void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter id");
        int id = scanner.nextInt();
        if (studentArray[id]!=null){
            studentArray[id] = null;
            System.out.println("Student deleted");
        }else {
            System.out.println("Student not found");
        }
    }

    private static void showStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter id");
        int id = scanner.nextInt();
        if (studentArray[id]!=null){
            Student student = studentArray[id];
            System.out.println(student.toString());
            int c=  scanner.nextInt();
            System.out.println("1.Update\n2.Back");
            scanner.nextLine();

            switch (c){
                case 1:
                    update(scanner, student);
                    break;
                default:
                    break;
            }


        }else {
            System.out.println("Student not found");
        }


    }

    private static void update(Scanner scanner, Student student) {
        System.out.println("Plz enter new Name");
        String name = scanner.nextLine();
        student.setName(name);
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
