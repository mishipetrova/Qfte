import java.util.*;


public class BetterAlgorithm {

    private List<Library> libraries;
    private Set<Book> uniqueBooks;
    // library id - score of all unique books
    private Map<Integer, Integer> libScoreMap;

    public BetterAlgorithm(List<Library> libraries) {

        this.libraries = libraries;
        this.uniqueBooks = findUniqueBooks( libraries );
        this.libScoreMap = findLibScores(libraries);
    }

    private Set<Book> findUniqueBooks(List<Library> libraries) {

        Set<Book> uniqueBooks = new HashSet<>(  );
        for (Library lib: libraries) {
            for (Book b: lib.getBooks()) {
                uniqueBooks.add( b );
            }
        }

        return uniqueBooks;
    }

    private Map<Integer, Integer> findLibScores (List<Library> libraries) {

        Map<Integer, Integer> libScoreMap = new HashMap<>();

        for (Library lib: libraries) {
            int score = 0;

            for (Book b: lib.getBooks()) {
                if (uniqueBooks.contains( b )) {

                }

            }
        }

        return libScoreMap;
    }
}
