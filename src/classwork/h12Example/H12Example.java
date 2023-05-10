package classwork.h12Example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class H12Example {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileReader reader = new FileReader("abc.xml");
             Scanner scanner = new Scanner(reader);
             FileWriter correctWriter = new FileWriter("results.doc");
             FileWriter incorrectWriter = new FileWriter("failed_results.doc")) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (line.length() == 15 && line.startsWith("docnum") || line.length() == 15 && line.startsWith("contract")) {
                    correctWriter.write(line + "\n");
                } else {
                    incorrectWriter.write(line + "\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
