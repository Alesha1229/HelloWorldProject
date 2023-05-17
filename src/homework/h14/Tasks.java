package homework.h14;

import classwork.c14.Fruit;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Tasks {
    int numberForPredicate;

    public Tasks(int numberForPredicate) {
        this.numberForPredicate = numberForPredicate;
    }

    public static void task1(){
        System.out.println("Task1");
        LocalDate exampleDate = LocalDate.of(2020, Month.FEBRUARY,15);
        System.out.println(exampleDate);
        System.out.println(exampleDate.getDayOfWeek());
        System.out.println();
    }
    public static void task2(){
        System.out.println("Task2");
        LocalDate currentDate;
        currentDate = LocalDate.now();
        int i = 0;
        while (currentDate.getDayOfWeek() != DayOfWeek.TUESDAY){
            i++;
            currentDate = LocalDate.now().plusDays(i);

        }
        System.out.println(currentDate);
        System.out.println(currentDate.getDayOfWeek());
        System.out.println();
    }
    public static void task3(){
        List<Tasks> numOfPred = new ArrayList<>();
        numOfPred.add((new Tasks(26)));

    }
}
