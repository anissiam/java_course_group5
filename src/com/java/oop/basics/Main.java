package com.java.oop.basics;

public class Main {
    int x;
    public static void main(String[] args) {
        Mobile obj1 = new Mobile("Samsung" , 6.7  ,400 ,"A21s" );
        obj1.printData();
        System.out.println(obj1.covertPrice() + " nsl");

        /*Shape1 shape1 = new Shape1();
        shape1.printData();


        Shape1 shape2 = new Shape1("triangle");
        shape2.printData();

        Shape1 shape3 = new Shape1("sssa" , 10 ,10);
        shape3.printData();*/

       /*printArray();

        Shape triangle = new Shape();
        triangle.name = "triangle";
        triangle.l = 10;
        triangle.w = 50;
        triangle.printData();
        System.out.println("Area = " + triangle.area());


        Shape squre = new Shape();
        squre.name = "sq";
        squre.printData();*/
        /*Person person = new Person();
        person.printData();
        person.printName("SAmi");*/

       /* Person obj = new Person();
        System.out.println(obj.name);
        obj.name = "Anis";
        System.out.println(obj.name);

        Person obj1 = new Person();
        obj1.name = "Azza";
        System.out.println(obj1.name);
*/


    }
    public static void printArray() {
        int[][] nums = {{3,5,7}, {2,7,9}, {1,2,3}};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
