package homework.h16;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainH16 {
    public static void main(String[] args) {
        List<Book> library = Arrays.asList(
                new Book("Star Wars Part 3",1980,"George Lucas"),
                new Book("Game of Thrones",2000,"Netflix :)"),
                new Book("Star Wars Part 4",1983,"George Lucas"),
                new Book("Witcher",2000,"CD Project RED"),
                new Book("Star Wars Part 1",1999,"George Lucas"),
                new Book("Star Wars PArt 2",2002,"George Lucas"));


        List<Book> filteredByYEar = library.stream()
                .sorted(Comparator.comparingInt(Book::getYear))
                .toList();
        System.out.println(filteredByYEar);


        Map<String, List<Integer>> yearCollectForEachAuthor = library.stream()
                .collect(Collectors.groupingBy
                        (Book::getAuthor,
                                Collectors.mapping
                                        (Book::getYear, Collectors.toList())));
        System.out.println(yearCollectForEachAuthor);

        Map<Integer, Long> yearCountOfBooks = library.stream()
                .collect(Collectors.groupingBy(Book::getYear, Collectors.counting()));

        System.out.println(yearCountOfBooks);

        Map<String, Long> authorCountOfBooks = library.stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.counting()));

        System.out.println(authorCountOfBooks);
    }


    }

