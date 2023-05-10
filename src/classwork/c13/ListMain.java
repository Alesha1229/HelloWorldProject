package classwork.c13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<String> secondStrings = new LinkedList<>(); // array and linked можно свободно менять

        strings.add("first");
        strings.add("second");
        strings.add("third");
        System.out.println(strings);

        secondStrings.add("fourth");
        secondStrings.add("fifth");
        System.out.println(secondStrings);

        strings.addAll(secondStrings);
        System.out.println(strings);

        strings.add(2,"next");
        System.out.println(strings);

        System.out.println(strings.contains("44"));
        System.out.println(strings.contains("next")); // есть ли
        System.out.println(strings.indexOf("44")); // -1 значит нету
        System.out.println(strings.indexOf("next")); // где лежит
        System.out.println(strings.isEmpty()); // пустой ли
        System.out.println(strings.get(4)); // получить 4ую позицию
        //System.out.println(strings.remove("next")); // удалить слово next
        System.out.println(strings.remove(1)); // удалить первый элемет
        System.out.println(strings.removeAll(secondStrings)); // удалить те слова что есть во втором из первого
        System.out.println(strings.set(1,"next")); // next заменит элнт 1
        System.out.println(strings.size());
        System.out.println(strings.subList(1,2)); //вывести с первого по второй
        System.out.println(strings);


        Collections.sort(secondStrings);
        System.out.println(secondStrings);
        Collections.reverse(secondStrings);
        System.out.println(secondStrings);

        Collections.shuffle(strings);
        System.out.println(strings);

        Collections.shuffle(strings);
        System.out.println(strings); // рандом тасовка

        for (String str: strings){
            System.out.println(str);
        }

    }
}
