package homework.h12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DocReader {
    public static void Reader() throws FileNotFoundException {
        System.out.println("Give me the path of your file");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        try {
            FileReader reader = new FileReader(String.valueOf(path));
            scanner = new Scanner(reader);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println();

        while (scanner.hasNext()) {
            String test = scanner.nextLine();
            DocumFilter.accept(test);
            //DocumFilter.accept(scanner1.toString());
            //System.out.println(scanner1.nextLine());

        }
    }
}
