import java.util.List;

public class CalculateBookScoreAvg implements CalculateBookScore {

    @Override
    public double calculate(List<Book> books) {
        double sum = 0L;
        for (Book book : books) {
            sum += (long) book.getScore();
        }
        return sum/books.size();
    }
}
