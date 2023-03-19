package com.java.oop.polymorphism.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter Env.");
        String env = scanner.nextLine();


        System.out.println("Plz enter Eat.");
        String eat = scanner.nextLine();

        System.out.println("1.Human\n2.Fish\n3.Birds");
        int c = scanner.nextInt();

        switch (c){
            case 1 :
                Human human = new Human();
                //poly(human, env, eat);
                Poly.poly(human, env, eat);
                break;

            case 2 :
                Fish fish = new Fish();
                Poly.poly(fish, env, eat);
                break;

            case 3 :
                Birds birds = new Birds();
                Poly.poly(birds, env, eat);
                break;
        }
    }

    public static void poly(Lives lives , String env , String eat) {
        lives.env(env);
        lives.eat(eat);

    }
}
