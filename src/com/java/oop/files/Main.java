package com.java.oop.files;

import com.java.oop.encapsulation.Student;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        //File file = new File("Hello.txt");
       // File file = new File("Hello1.txt");
        File file = new File("Hello2.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }



       /* Student student = new Student("sami" , 30 , "CS");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/
        /*try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write("Hello from java class".getBytes());
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        /*try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int c = fileInputStream.read();
            while (c!=-1){
                System.out.print((char) c);
                c = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/


        /*else {
            //file.delete();
           //System.out.println(file.getAbsoluteFile());
        }*/

        /*try {
            char[] chars = {'s', 'w', 'q'};
            FileWriter fileWriter = new FileWriter(file );
            fileWriter.write("Hello my name is anis\n");
            fileWriter.write('a');
            fileWriter.write(chars);

            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


       /* try {
            FileReader fileReader = new FileReader(file);
            //System.out.println((char) fileReader.read());
            int c = fileReader.read();
            while (c!=-1){
                //System.out.print((char) fileReader.read());
                System.out.print((char) c);
                c = fileReader.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }
}
