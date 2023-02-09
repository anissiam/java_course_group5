package com.java5.basics;

public class Strings {

    public static void main(String[] args) {
        String line = "Hello to java class xfgdxffdskmfsdk xdvdklmvdx java sdfl;dsv;zdlcvzdlvczd java";
        String name = "Anis       ";
        //System.out.println(name + " Siam");
        String name1 = "Anis";
        String name3 = "anis ";
                            //هل يساوي by ref
        System.out.println(name == name1);

        String name2 = new String("Anis");

        System.out.println(name == name2);

        System.out.println(name.length()); // طول النص
        System.out.println(name.equals(name1)); // فحص المساواه ب value
        System.out.println(name.equals(name2)); // فحص المساواه ب value
        System.out.println(name.equalsIgnoreCase(name3)); // فحص المساواه بغض النظر عن حساسية الحرف
        System.out.println(name.trim());
        name = name.trim();
        System.out.println(name);

        System.out.println(name.concat(name1));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(line.indexOf("java"));
        System.out.println(line.indexOf("j"));
        System.out.println(line.indexOf("a"));
        System.out.println(line.lastIndexOf("a"));
        System.out.println(line.lastIndexOf("class"));
        System.out.println(line.substring(2));
        System.out.println(line.substring(2,10));
        System.out.println(name.charAt(0));
        System.out.println(line.contains("java"));
        System.out.println(line.contains("Java"));
        System.out.println(line.contains("HI"));
        System.out.println(line.replace("java", "c++"));
        System.out.println(line.startsWith("HI"));
        System.out.println(line.startsWith(" "));
        System.out.println(line.startsWith("He"));
        System.out.println(line.endsWith("a"));
        System.out.println(line.endsWith(" "));
        System.out.println(line.endsWith("java"));
        System.out.println(line.endsWith("Java"));

        System.out.println("Hi from \"java\"");
        System.out.println("Hi from \'java\'");
        System.out.println("Hi from \\java\\");

        System.out.println("Hi from\njava");
        System.out.println("Hi from\bjava");
        System.out.println("Hi from\rjava");
        System.out.println("Hi from \t java");











    }
}
