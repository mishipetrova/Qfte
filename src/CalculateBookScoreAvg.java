import java.util.List;

public class CalculateBookScoreAvg implements CalculateBookScore {

    @Override
    public double calculate(List<Book> books) {
        double sum = 0;
        for (Book book : books) {
            sum += book.getScore();
        }
        return sum/books.size();
    }
}
