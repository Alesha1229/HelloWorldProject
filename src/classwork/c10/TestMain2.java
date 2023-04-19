package classwork.c10;

import java.util.Arrays;

public class TestMain2 {
    public static void main(String[] args) {
        String str = "This is my string";
        String str2 = "This is MY string";
        System.out.println(str.toLowerCase()); // всё в малые буквы
        System.out.println(str.toUpperCase()); // в большие
        System.out.println(str.equalsIgnoreCase(str2)); // сравнивает, игнорит размер

        System.out.println(str.replace('i','a')); // поменять все i на все a
        System.out.println(str.replace("is","as")); // все is на все as

        System.out.println(str.contains("is")); // есть ли у строчки is
        System.out.println(str.indexOf("is")); // говорит место, где is
        System.out.println(".................................");
        System.out.println(str.indexOf("is",6)); // искить is с 6ого символа(вывел -1, ничего не неашёл)

        System.out.println(str.lastIndexOf("is")); // исчет is с конца

        System.out.println(str.replace(" ", "*")); // меняет всё, без учёта спец символов
        System.out.println(str.replaceFirst(" ", "*")); // меняет первое
        System.out.println(str.replaceAll(" ", "*")); // меняет всё, с учётом спец символов

        String str4 = "bubum";
        System.out.println(str4+2); // можно соеденить с цифрами, и другими объектами
        System.out.println(str4.repeat(5));
        System.out.println(str4.startsWith("bu")); // начинается ли с bu
        System.out.println(str4.endsWith("um")); // заканчивется ли на um

        String [] myArr = str.split(" "); // поделить str на элементы массива, делит когда видит пробел
        System.out.println(Arrays.toString(myArr));

        String str5 =" ";
        System.out.println(str5.isEmpty()); // проверяет пустая ли строка
        System.out.println(str5.isBlank()); // не учитывает пробел как символ и проверяет пустая ли

        int myVal = 125;
        String result = String.valueOf(myVal);
        String result2 = myVal + "";
        System.out.println(result);
        System.out.println(result2);


    }
}
