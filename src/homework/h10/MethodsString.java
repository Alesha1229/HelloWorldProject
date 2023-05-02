package homework.h10;

import java.util.Arrays;
import java.util.Locale;

public class MethodsString {

    public static void task1(String format){
        System.out.println("- Вывести на экран в одну строку два первых блока по 4 цифры.");
        String localFormat = format;
        System.out.print(localFormat.substring(0,4));
        System.out.println(localFormat.substring(9,13));
        System.out.println("....................................................");


    }
    public static void task2(String format) {
        System.out.println("- Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).");
        StringBuilder localFormat = new StringBuilder(format);
        localFormat.replace(5,8,"***");
        localFormat.replace(14,17,"***");
        System.out.println(localFormat);

        System.out.println("....................................................");
    }

    public static void task3(String format){
        System.out.println("- Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.");
        String localFormat =  format;
        localFormat = localFormat.toLowerCase();
        System.out.print(localFormat.substring(5,8));
        System.out.print("/");
        System.out.print(localFormat.substring(14,17));
        System.out.print("/");
        System.out.print(localFormat.charAt(19));
        System.out.print("/");
        System.out.println(localFormat.charAt(21));
        System.out.println("....................................................");
    }

    public static void task4(String format){
        System.out.println("Вывести на экран буквы из номера документа в формате Letters:yyy/yyy/y/y в верхнем регистре(реализовать с помощью класса StringBuilder).");
        StringBuilder localFormat = new StringBuilder(format);
        localFormat.insert(19,"-");
        localFormat.insert(21,"-");
        localFormat.insert(23,"-");
        String lastLocalForm = new String(localFormat);
        lastLocalForm = lastLocalForm.toUpperCase();
        String [] myArr = lastLocalForm.split("-"); // поделить str на элементы массива, делит когда видит пробел
        localFormat = new StringBuilder();
        localFormat.append(myArr[1]);
        localFormat.append("/");
        localFormat.append(myArr[3]);
        localFormat.append("/");
        localFormat.append(myArr[5]);
        localFormat.append("/");
        localFormat.append(myArr[7]);
        System.out.println(localFormat);

        System.out.println("....................................................");
    }

    public static void task5(String format){
        System.out.println("- Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).");
        format = format.toLowerCase();
        if(format.contains("abc")){
            System.out.println("ABC в документе присутствует");
        } else {
            System.out.println("ABC в документе отсутствует");
        }
        System.out.println("....................................................");
    }

    public static void task6(String format){
        System.out.println("Проверить начинается ли номер документа с последовательности 555");

        if(format.startsWith("555")){
            System.out.println("Документ начинается с 555");
        } else {
            System.out.println("Документ не начинается с 555");
        }
        System.out.println("....................................................");


    }

    public static void task7(String format){
        System.out.println("Проверить заканчивается ли номер документа на последовательность 1a2b");

        if(format.endsWith("1a2b")){
            System.out.println("Документ заканчивается на 1a2b");
        } else {
            System.out.println("Документ не заканчивается на 1a2b");
        }
        System.out.println("....................................................");


    }

















    }
