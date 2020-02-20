import java.util.List;

public class CalculateLibraryScoreAvg implements CalculateLibraryScore {

    CalculateBookScoreAvg cbsa;

    @Override
    public double calculate(Library library, List<Book> books) {
        double score = 0;
        score = ( cbsa.calculate(library.getBooks() ) * library.getBooksPerDay() ) - ( library.getDays() * cbsa.calculate(books) );
        return score ;
    }

}
