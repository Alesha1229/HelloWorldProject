package classwork.c14;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateMainExample {
    public static void main(String[] args) {
        LocalDateTime time;
        LocalDate date;
        Date oldDate;
        Calendar calendar;

        date = LocalDate.now();
        time = LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(date.plusDays(1));
        System.out.println(time.minusDays(1));
//        date = date.plusMonths(1)
//                .plusWeeks(1)
//                .plusYears(1);
        time = time.plusSeconds(1)
                .plusMinutes(1)
                .plusHours(1);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());

        LocalDate nextDate = LocalDate.now().plusDays(1);
        System.out.println(date.isAfter(nextDate));
        System.out.println(date.isBefore(nextDate));
        LocalDate exactDate = LocalDate.of(2020, Month.FEBRUARY,15);
        LocalDate exact2Date = LocalDate.of(2020, 2,15);
        SimpleDateFormat format = new SimpleDateFormat("yyyy   MM   dd");
        System.out.println(format.format(new Date()));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String stringDate = "20-03-2022";
        String secondStringDate = "20-03-2021";

        System.out.println(LocalDate.parse(stringDate, formatter));
        System.out.println(LocalDate.parse(secondStringDate, formatter));

    }
}
