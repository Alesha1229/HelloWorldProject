package classwork.c12;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        try {


            FileWriter writer = new FileWriter("abcWriter.doc",true); // без true, будет переписывать заново
            writer.write("this is my string1\n");
            writer.write("this is my string2\n");
            //writer.flush(); // записать не дожидаясь конца программмы
            writer.write("this is my string3\n");


            writer.close();
        } catch (IOException e){
            throw new RuntimeException(e);

        }

    }
}
