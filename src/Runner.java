import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Runner {
    private List<Library> libraries;
    private SolutionWriter solutionWriter;
    private int maxDays;

    private void fill(List<Pair<Library,List<Book>>>) {

    }

    public void setLibraries(List<Library> libraries) {
        this.libraries = libraries;
    }

    public void setSolutionWriter(SolutionWriter solutionWriter) {
        this.solutionWriter = solutionWriter;
    }

    public void setMaxDays(int maxDays) {
        this.maxDays = maxDays;
    }

    public Runner(List<Library> libraries, SolutionWriter solutionWriter, int maxDays) {
        this.libraries = libraries;
        this.solutionWriter = solutionWriter;
        this.maxDays = maxDays;
    }

    public void run() {
        LinkedList<Library> readyLibs = new LinkedList<>();
        LibSigner libSigner = new LibSigner();
        List<Pair<Library,List<Book>>> result = new ArrayList<>();

        int unsignedLibIndex = 0;
        libSigner.signLibrary(libraries.get(unsignedLibIndex).getDays(), unsignedLibIndex);
        unsignedLibIndex++;

        for (int day = 1; day < maxDays; day++) {
            if (libSigner.incrementAndCheckEmpty()) {
                libSigner.signLibrary(libraries.get(unsignedLibIndex).getDays(), unsignedLibIndex);
                unsignedLibIndex++;
                readyLibs.addLast(libraries.get(unsignedLibIndex - 2));
            }
        }

        for (Library library : readyLibs) {
            int count = 0;
            while (count < library.getBooksPerDay() && !library.getBooks().isEmpty()) {
                Book nextBook = library.getBooks().remove(0);
                if (scanBook(result, library.getBooks().get(0))) {
                    count++;
                }
            }


        }
    }

    private boolean scanBook(List<Pair<Library,List<Book>>> result, Book book) {
        if (book.isScanned()) {
            return false;
        }
        return false;

    }
}
