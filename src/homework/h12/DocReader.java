package homework.h12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DocReader {
    public static void Reader() throws FileNotFoundException {
        System.out.println("Give me the path of your file");
        String path = "C:\\h12FIle.doc";
        System.out.println(path);
        //Scanner path = new Scanner(System.in);
        FileReader reader = new FileReader(String.valueOf(path));
        Scanner scanner1 = new Scanner(reader);
        System.out.println();

        while (scanner1.hasNext()) {
            String test = scanner1.nextLine();
            DocumFilter.accept(test);
            //DocumFilter.accept(scanner1.toString());
            //System.out.println(scanner1.nextLine());

        }
    }
}
