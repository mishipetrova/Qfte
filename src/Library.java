import java.util.*;

public class Library {

    private int id;
    //the set of books in the library
    private List<Book> books;
    //the time in days that it takes to sign the library up for scanning
    private int days;
    //the number of books that can be scanned each day from the library once the library is signed up
    private int booksPerDay;


    public Library(int id,List<Book> books, int days, int booksPerDay) {
        this.id = id;
        this.books = books;
        this.days = days;
        this.booksPerDay = booksPerDay;
    }


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getBooksPerDay() {
        return booksPerDay;
    }

    public void setBooksPerDay(int booksPerDay) {
        this.booksPerDay = booksPerDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
