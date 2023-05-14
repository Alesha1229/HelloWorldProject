package homework.h13;

import java.io.FileReader;
import java.util.*;

public class Tasks {
    public static Scanner scanner = new Scanner(System.in);
    public static Scanner food = new Scanner(System.in);

    public static void task1() {
        try {
            FileReader reader = new FileReader("h13.txt");
            scanner = new Scanner(reader);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Set<String> set = new TreeSet<>();
        while (scanner.hasNext()) {
            String str = scanner.next();
            set.add(str);
        }
        System.out.println(set);

    }

    public static void task2() {
        try {
            FileReader reader = new FileReader("h13.txt");
            scanner = new Scanner(reader);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Set<String> set = new HashSet<>();
        while (scanner.hasNext()) {
            String str = scanner.next();
            set.add(str);
        }
        System.out.println(set);

    }

    public static void task3() {
        Map<String, List<String>> tastyMap = new HashMap<>();
        List<String> vegetables = new ArrayList<>();
        List<String> fruits = new ArrayList<>();
        List<String> other = new ArrayList<>();
        for(int i = 0; i<5;i++){
            System.out.println("Введите еду");
            food = new Scanner(System.in);
            String strFood = food.nextLine();
            System.out.println("Что вы ввели?");
            System.out.println("1) Овощ");
            System.out.println("2) Фрукт");
            System.out.println("3) Другое");
            int numOfFood = food.nextInt();
            switch (numOfFood){
                case 1:
                    vegetables.add(strFood);
                    break;
                case 2:
                    fruits.add(strFood);
                    break;
                case 3:
                    other.add(strFood);
                    break;
            }

        }

        tastyMap.put("Овощ", vegetables);
        tastyMap.put("Фрукт", fruits);
        tastyMap.put("Другое", other);
        System.out.println(tastyMap);




    }
}
