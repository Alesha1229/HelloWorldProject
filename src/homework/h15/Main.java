package homework.h15;

import classwork.c14.Fruit;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomNumbers.add(random.nextInt(20));
        }
        System.out.println(randomNumbers);

        List<Integer> task1 = randomNumbers.stream()
                .distinct()
                .toList();
        System.out.print("Task1:");
        System.out.println(task1);

        List<Integer> task2 = randomNumbers.stream()
                .filter(x -> x % 2 == 0 && x>7 && x<17)
                .toList();
        System.out.print("Task2:");
        System.out.println(task2);

        List<Integer> task3 = randomNumbers.stream()
                .map(x -> x*2)
                .toList();
        System.out.print("Task3:");
        System.out.println(task3);

        List<Integer> task4 = randomNumbers.stream()
                .sorted()
                .limit(4)
                .toList();
        System.out.print("Task4:");
        System.out.println(task4);

        Long task5 = randomNumbers.stream()
                .count();
        System.out.print("Task5:");
        System.out.println(task5);

        Double task6 = randomNumbers.stream()
                        .mapToDouble(x -> x)
                                .average()
                                        .orElse(0.0);
        System.out.print("Task6:");
        System.out.println(task6);

    }
}
