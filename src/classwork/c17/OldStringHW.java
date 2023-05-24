package classwork.c17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class OldStringHW {
    public static final String DEFAULT_DOC_FORMAT = "(\\d{4}-[a-z]{3}-){2}(\\d[a-z]){2}";
    public static final String NUMBERS_WITH_MINUS = "\\d+-?";

    public static void main(String[] args) {
        Pattern docNumberFilter = Pattern.compile(DEFAULT_DOC_FORMAT, Pattern.CASE_INSENSITIVE);
        String testCase = "0504-abc-5678-def-1a2b";
        System.out.println(docNumberFilter.matcher(testCase).matches());
        Matcher matcher = docNumberFilter.matcher(testCase);
        if (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));


        }
        System.out.println("First task");
        printFirst4Letters(testCase);
        System.out.println("Second task");
        printFirstSecond4Letters(testCase);
        System.out.println("Third task");
        printWithoutLetters(testCase);
        System.out.println("Fourth task");
        printOnlyLetters(testCase);

        printIfDocStartsWithNumThatBetw100and150(testCase);
    }

    private static void printIfDocStartsWithNumThatBetw100and150(String str){
        Pattern pattern = Pattern.compile("1([0-4][0-9]|50).+");
        System.out.println( pattern.matcher(str).matches());
    }

    private static void printFirst4Letters(String str) {
        Pattern pattern = Pattern.compile("(\\d{4})(-[a-z]{3}-)(\\d{4}-[a-z]{3}-)(\\d[a-z]){2}", Pattern.CASE_INSENSITIVE);
        //String str = "1234-abc-5678-def-1a2b";
        System.out.println(pattern.matcher(str).matches());
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group(1));

        }
    }

    private static void printFirstSecond4Letters(String str) {
        Pattern pattern = Pattern.compile("(\\d{4})(-[a-z]{3}-)(\\d{4})(-[a-z]{3}-)(\\d[a-z]){2}", Pattern.CASE_INSENSITIVE);
        //String str = "1234-abc-5678-def-1a2b";
        System.out.println(pattern.matcher(str).matches());
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(1) + matcher.group(3));

        }
    }

    private static void printWithoutLetters(String str) {
        System.out.println(str.replaceAll("[a-z]{3}", "***"));

    }
    private static void printOnlyLetters(String str) {
        System.out.println(str
                .replaceAll(NUMBERS_WITH_MINUS, "")
                .replaceAll("-","/"));


    }
}
