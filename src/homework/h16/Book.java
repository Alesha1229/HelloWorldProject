package homework.h16;

public class Book {
    private final String bookName;
    private final int year;
    private final String author;


    public Book(String bookName, int year, String author) {
        this.bookName = bookName;
        this.year = year;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", year=" + year +
                ", Author='" + author + '\'' +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    }
