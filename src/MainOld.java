import java.util.*;

public class MainOld {
    public static void main(String[] args) {
       String fileName = args[0];
       InputReader reader =  new InputReader(fileName);
       List<Library> libs = reader.getLibraries();

       List<Book> books = reader.getBooks();
       Map<Integer, Integer> occurMap = reader.getOccurMap();

       for (int index = 0; index < books.size(); index++) {
           Book book = books.get(index);
           book.updateScore(occurMap.get(book.getId()));
       }

       for (Library library : libs) {
           int score = 0;
           for (Book book : library.getBooks()) {
               score += book.getScore();
           }
           library.setScore(score);
       }

        libs.sort(new Comparator<Library>() {
            @Override
            public int compare(Library library, Library t1) {
                return - Integer.compare(library.getScore(), t1.getScore());
            }
        });

       String outputFileName = fileName.substring(0, fileName.length() - 4) + "-solution.txt";
       SolutionWriter solutionWriter = new SolutionWriter(outputFileName);

       Runner runner = new Runner(libs, solutionWriter, reader.getNumOfDays());
       runner.run();
    }
}
