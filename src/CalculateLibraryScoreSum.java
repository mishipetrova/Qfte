import java.util.List;

public class CalculateLibraryScoreSum implements CalculateLibraryScore {

    CalculateBookScoreSum cbss;
    CalculateBookScoreAvg cbsa;

    @Override
    //Calculates Library score
    //Inputs : library - The library to calculate
    //       : books   - A list of all books
    public double calculate(Library library, List<Book> books) {
        double score = 0;
        score = ( cbss.calculate(library.getBooks() ) * library.getBooksPerDay() ) - ( library.getDays() * cbsa.calculate(books) );
        return score ;
    }

}
