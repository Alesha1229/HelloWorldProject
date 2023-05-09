package homework.h12;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DocCreator {
    static File doc = new File("C:\\h12FIle.doc");
    public static void CreateDoc(String firstDocNumber,String secondDocNumber,String thirdDocNumber) throws IOException {
        FileWriter writer = new FileWriter(doc); // без true, будет переписывать заново
        writer.write(firstDocNumber + "\n");
        writer.write(secondDocNumber + "\n");
        //writer.flush(); // записать не дожидаясь конца программмы
        writer.write(thirdDocNumber + "\n");



        writer.close();



    }
}
