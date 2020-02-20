import java.util.List;

public class CalculateBookScoreSum implements CalculateBookScore{

    @Override
    public double calculate(List<Book> books) {
        double sum = 0L;
        for (Book book : books) {
            sum += (long) book.getScore();
        }
        return sum;
    }
}
