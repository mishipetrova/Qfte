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

    // Function for calculating median
    public static double findMedian(int[] a, int n)
    {
        // First we sort the array
        Arrays.sort(a);

        // check for even case
        if (n % 2 != 0)
            return (double)a[n / 2];

        return (int)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }

    public int CalculateLibraryScoreM(Library lib) {
        List<Book> books = getBooks(); //books score increasing sorted
        int[] scores = new int[books.size()];
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
//            scores[i] = b.getScore();
        }
        Arrays.sort(scores);
        int median = (int) findMedian(scores, books.size());
        List<Book> temp_books;
        List<Book> high_score_books = new ArrayList<>();
        for (int i = median; i < books.size(); i++) {
            high_score_books.add(books.get(i));

        }
        int sum = 0;
        for (Book b: high_score_books) {
            sum += b.getScore();
        }
        int lib_score = (sum / high_score_books.size()) + lib.getDays();

        return lib_score;
    }

    public Pair<Integer,List<Book>> CalculateLibraryScoreM() {
        if(this.books.size() ==0){
            return new Pair<>(0,new ArrayList<>());
        }
        List<Book> books = getBooks(); //books score increasing sorted
        int[] scores = new int[books.size()];
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            scores[i] = b.getScore();
        }
        Arrays.sort(scores);
        int median = (int) findMedian(scores, books.size());
        List<Book> temp_books;
        List<Book> high_score_books = new ArrayList<>();
        for (int i = median; i < books.size(); i++) {
            high_score_books.add(books.get(i));

        }
        int sum = 0;
        for (Book b: high_score_books) {
            sum += b.getScore();
        }
        if(high_score_books.size() == 0){
            return new Pair<>(0,new ArrayList<>());

        }
        int lib_score = (sum / high_score_books.size()) - this.getDays();
        return new Pair<Integer,List<Book>>(lib_score,high_score_books);
    }
}
