package homework.h12;

public class DocumFilter {
    public static void accept(String str) {
        if (str.length() == 15 && str.startsWith("docnum") || str.length() == 15 && str.startsWith("contract")) {
            System.out.println(str);

        }
    }
}
