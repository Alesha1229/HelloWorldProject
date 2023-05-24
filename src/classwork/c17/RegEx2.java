package classwork.c17;
import static java.util.regex.Pattern.CASE_INSENSITIVE;
import static java.util.regex.Pattern.compile;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
    public static void main(String[] args) {
        List<String> testStrings = Arrays.asList("ABC", "abc", "f", "F", "", "a1a", "a11", "a.1","a..1");
        //Pattern pattern = compile("[a-z]"); // 1 малая буква
        //Pattern pattern = compile("[a-z]+"); // как минимум 1 малая буква
        //Pattern pattern = compile("[a-z]*"); // от 0 до бесконечности малых букв
        //Pattern pattern = compile("[a-z]?"); // или 0 или 1 малая буква
        //Pattern pattern = compile("[a-z]{2,3}"); // от 2ух до трёх малых букав
        //Pattern pattern = compile("[a-zA-Z]+"); // можно и все большие и все малые
        //Pattern pattern = compile("[a-z]+",   /*Pattern.*/  CASE_INSENSITIVE); // можно и все большие и все малые
        // Работает и без патерна тк есть сверху эта строчка import static java.util.regex.Pattern.CASE_INSENSITIVE
        //Pattern pattern = compile("[^a-z]+"); // всё кроме малых ихотябы 1 любой символ
        //Pattern pattern = compile("[a-z]+\\d+[a-z]+"); // малая буква + любая цифра + малая буква
        //Pattern pattern = compile("[a-z]+\\d+$"); // долар говорит что строчка этим заканчивается
        //Pattern pattern = compile("[a-z]+\\.\\d+"); // ищем между одну точку
        //Pattern pattern = compile("[a-z]+.\\d+");
        Pattern pattern = compile("([a-z]+.)(\\d+)");
        testStrings.forEach(str -> {
            Matcher matcher = pattern.matcher(str);
            System.out.println(str+" matches?"+ matcher.matches());
        });
    }
}
