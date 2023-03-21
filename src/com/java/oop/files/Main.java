package com.java.oop.files;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("Hello.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }/*else {
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


        try {
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
        }
    }
}
