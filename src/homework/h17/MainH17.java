package homework.h17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.regex.Pattern;


public class MainH17 {
    static Map<String, Document> allDocumentsInfo = new TreeMap<>();



    public static final String DEFAULT_DOC_FORMAT = "(\\d{4}-[a-z]{3}-){2}(\\d[a-z]){2}";
    public static final String DEFAULT_PHONE_FORMAT = "^\\+\\(\\d{2}\\)\\d{7}$";
    public static final String DEFAULT_MAIL_FORMAT = "^[A-Za-z0-9+_.-]{2,}+@[A-Za-z]{2,}+.[A-Za-z]{2,}$";

    public static void main(String[] args) {
        readAndWriteDocInfo("src\\homework\\h17\\txtFiles\\my_first_fIle.txt","my_first_fIle");
        readAndWriteDocInfo("src\\homework\\h17\\txtFiles\\my_second_fIle.txt","my_second_fIle");
        readAndWriteDocInfo("src\\homework\\h17\\txtFiles\\my_third_fIle.txt","my_third_FIle");

        System.out.println(allDocumentsInfo);
    }

    public static String sortingDocPhoneMail(String str) {
        Pattern docNumber = Pattern.compile(DEFAULT_DOC_FORMAT);
        Pattern phoneNumber = Pattern.compile(DEFAULT_PHONE_FORMAT);
        Pattern mail = Pattern.compile(DEFAULT_MAIL_FORMAT);

        if (docNumber.matcher(str).matches()) {
            return "thisDoc";
        } else if (phoneNumber.matcher(str).matches()) {
            return "thisPhone";
        } else if (mail.matcher(str).matches()) {
            return "thisMail";
        } else return null;
    }

    public static void readAndWriteDocInfo(String path, String fileName) {
        Scanner scanner;
        try {
            FileReader reader = new FileReader(String.valueOf(path));
            scanner = new Scanner(reader);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        List<String> docs = new ArrayList<>();
        String phone = null;
        String mail = null;

        while (scanner.hasNext()) {
            String test = scanner.nextLine();
            switch (Objects.requireNonNull(sortingDocPhoneMail(test))) {
                case "thisDoc" -> docs.add(test);
                case "thisPhone" -> phone = test;
                case "thisMail" -> mail = test;
            }


        }
        allDocumentsInfo.put(fileName,new Document(docs, phone, mail));




    }
}
