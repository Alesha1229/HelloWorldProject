package classwork.c16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HomeEx {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("dd-MM-yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("give the date");
        String date = sc.nextLine();
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);
    }
}
