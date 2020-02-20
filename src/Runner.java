import java.util.*;

public class Runner {
    private List<Library> libraries;
    private SolutionWriter solutionWriter;
    private int maxDays;

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
        HashMap<Integer, List<Book>> libToBook = new HashMap<>();

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
                if (scanBook(result, nextBook, library, libToBook)) {
                    count++;
                }
            }
        }

        for (Map.Entry<Integer, List<Book>> entry : libToBook.entrySet()) {
            Pair<Library, List<Book>> pair = new Pair<>(new Library(entry.getKey(), null, 0, 0), entry.getValue());
            result.add(pair);
        }

        solutionWriter.writeToFile(result);
    }

    private boolean scanBook(List<Pair<Library,List<Book>>> result, Book book, Library library
            , HashMap<Integer, List<Book>> libToBook) {
        if (book.isScanned()) {
            return false;
        }

        List<Book> scanned= libToBook.getOrDefault(library.getId(), new ArrayList<>());
        scanned.add(book);
        libToBook.put(library.getId(), scanned);

        return true;
    }
}
