import java.util.List;

public class CalculateLibraryScoreSum implements CalculateLibraryScore {

    CalculateBookScoreSum cbss;
    CalculateBookScoreAvg cbsa;

    @Override
    public double calculate(Library library, List<Book> books) {
        double score = 0;
        score = ( cbss.calculate(library.getBooks() ) * library.getBooksPerDay() ) - ( library.getDays() * cbsa.calculate(books) );
        return score ;
    }

}
