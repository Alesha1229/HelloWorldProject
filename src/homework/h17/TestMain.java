package homework.h17;

import java.util.regex.Pattern;

public class TestMain {
    public static void main(String[] args) {
        String str = "+45)1960101";
        Pattern mail = Pattern.compile("^\\+\\(\\d{2}\\)\\d{7}$");
        System.out.println(mail.matcher(str).matches());
    }
}
