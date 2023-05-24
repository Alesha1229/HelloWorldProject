package homework.h16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    private final String bookName;
    private final int year;
    private final String Author;


    public Book(String bookName, int year, String author) {
        this.bookName = bookName;
        this.year = year;
        Author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", year=" + year +
                ", Author='" + Author + '\'' +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return Author;
    }

    }
