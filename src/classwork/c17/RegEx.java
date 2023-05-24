package classwork.c17;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        String testString = "This is my 1 test string, - 12345";
        String test2 = "12345";

        Pattern numbers = Pattern.compile("\\d+");      //Задание шаблона дял поиска
        Matcher numbersMather = numbers.matcher(testString);
        System.out.println(numbersMather.matches()); // проверить всю строку

        Matcher numbersMather2 = numbers.matcher(test2);
        System.out.println(numbersMather2.matches());
        //if (numbersMather.find()){ // find - мы найдём что тодходящуу по шаблонам
        //    System.out.println(numbersMather.start() + " " + numbersMather.end()); //даёт нам точное начало
        //    System.out.println(numbersMather.group()); // возращает этот кусок

        //numbersMather.usePattern(Pattern.compile("test"));
        while (numbersMather.find()){ //найти среди всего
            System.out.println(numbersMather.start() + " " + numbersMather.end()); //даёт нам точное начало
            System.out.println(numbersMather.group()); // возращает этот кусок
        }
        numbersMather.reset(); // сброс, нужен тк методы сверху запоминают позицию в строке
        numbersMather.results()
                .map(MatchResult::group)
                .forEach(len -> System.out.println(len));

    }

}
