import java.util.List;

public class CalculateLibraryScoreSum implements CalculateLibraryScore{

    @Override
    public Long calculate(List<Book> books) {
        Long sum = 0L;
        for (Book book : books) {
            sum += (long) book.getScore();
        }
        return sum;
    }
}
