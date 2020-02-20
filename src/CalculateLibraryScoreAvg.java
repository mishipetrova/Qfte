import java.util.List;

public class CalculateLibraryScoreAvg implements CalculateLibraryScore {

    public Long calculate(List<Book> books) {
        Long sum = 0L;
        for (Book book : books) {
            sum += (long) book.getScore();
        }
        return sum/books.size();
    }
}
