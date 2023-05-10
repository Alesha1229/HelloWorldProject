package classwork.c13;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, String> firstMap = new HashMap<>(); // вместо чисел, ключи могут быть строчками
        Map <Integer, String> secondMap = new TreeMap<>();
        firstMap.put(1,"Red");
        firstMap.put(2,"Orange");
        firstMap.put(3,"Yellow");
        firstMap.put(1,"next");
        System.out.println(firstMap.get(1));
        System.out.println(firstMap.get(4));

        secondMap.put(1,"Red");
        secondMap.put(2,"Orange");
        secondMap.put(3,"Yellow");


        System.out.println(firstMap.containsKey(3)); // есть ли третий ключ?
        System.out.println(firstMap.isEmpty());
        System.out.println(firstMap.size()); //колво ключей
        //System.out.println(firstMap.remove(3)); // удалить 3ий ключ
        System.out.println(firstMap.keySet()); // показать все ключи
        System.out.println(firstMap.values()); // показать все значения(то что после ключей)
        System.out.println(firstMap);
        for (Integer key: firstMap.keySet()){
            System.out.println(firstMap.get(key));
        }
        firstMap.forEach((k,v) -> System.out.println(k + " " + v));

        List<Integer> integers;
        List<List<Integer>> integers2;
        Map<String, List<String>> myMap = new HashMap<>();
        // computers (Lenovo, Asus);
        // phones (Samsung, Apple);

        List<String> computers = new ArrayList<>();
        computers.add("Lenovo");

        List<String> phones = new ArrayList<>();
        phones.add("Samsung");

        myMap.put("computers", computers);
        myMap.put("phones", phones);



    }
}
