package com.java.oop.polymorphism;

public class Main {
    public static void main(String[] args) {
        Poly1 poly1 = new Poly1();
        Square square = new Square();
        poly1.getArea(square, 10, 10);


        Rectangle rectangle = new Rectangle();
        poly1.getArea(rectangle , 10 , 20);



       /* A a = new A();
        getPrint(a);*/
        //Poly poly = new Poly();

        /*A b = new B();  // B ex A
        poly.doPoly(b);
        //getPrint(b);


        poly.doPoly(new C());
*/
        //A c = new C();

        //getPrint(c);


    }

    public static void getPrint(A a){
        a.print();
    }
}
