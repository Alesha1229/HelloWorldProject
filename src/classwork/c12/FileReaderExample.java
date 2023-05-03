package classwork.c12;

import java.io.*;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) throws FileNotFoundException {
        /*Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner("abraCadabra");

        System.out.println(scanner1.nextInt());*/



        try {
            FileReader reader = new FileReader("abcWriter.doc");
            Scanner scanner2 = new Scanner(reader);
            while (scanner2.hasNext()){
                System.out.println(scanner2.nextLine());
            }

        } catch (IOException e){
            throw new RuntimeException(e);

        }
    }
}
