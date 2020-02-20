import jdk.internal.util.xml.impl.Input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class InputReader {
    private String filename;
    private List<Library> libraries;
    private List<Book> books;
    private Map<Integer,Integer> occurMap;
    private Map<Integer,Integer> scoreMap;
    private int numOfBooks;
    private int numOfLibraries;
    private int numOfDays;

    public InputReader (String filename){
        this.filename = filename;
        this.libraries = new ArrayList<>();
        this.books = new ArrayList<>();
        this.occurMap = new HashMap<>();
        this.scoreMap = new HashMap<>();
        this.readFile();

    }


    private void readFile(){
        File file = new File(filename);





        try {
            Scanner sc =new Scanner(file);
            String line  = sc.nextLine();
            String[] strings =   line.split(" ");
            numOfBooks = Integer.parseInt(strings[0]);
            numOfLibraries = Integer.parseInt(strings[1]);
            numOfDays = Integer.parseInt(strings[2]);
            line = sc.nextLine();
            strings = line.split(" ");
            for(int i = 0 ;i < strings.length;i++){
                scoreMap.put(i,Integer.parseInt(strings[i]));
            }

            for(int i = 0; i < numOfLibraries;i++){
                line = sc.nextLine();
                strings = line.split(" ");

                int numBooks = Integer.parseInt(strings[0]);
                int signup = Integer.parseInt(strings[1]);
                int booksPerDay = Integer.parseInt(strings[2]);
                List<Book> books = new ArrayList<>();

                line = sc.nextLine();
                strings = line.split(" ");
                for(String s : strings){
                    if(occurMap.containsKey(Integer.parseInt(s))){
                        occurMap.put(Integer.parseInt(s),occurMap.get(Integer.parseInt(s)) + 1);
                    }
                    else{
                        occurMap.put(Integer.parseInt(s),1);

                    }
                    books.add(new Book(Integer.parseInt(s),scoreMap.get(Integer.parseInt(s))));
                }
                libraries.add(new Library(i,books,signup,booksPerDay));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String getFilename() {
        return filename;
    }

    public List<Library> getLibraries() {
        return libraries;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Map<Integer, Integer> getOccurMap() {
        return occurMap;
    }

    public Map<Integer, Integer> getScoreMap() {
        return scoreMap;
    }

    public int getNumOfBooks() {
        return numOfBooks;
    }

    public int getNumOfLibraries() {
        return numOfLibraries;
    }

    public int getNumOfDays() {
        return numOfDays;
    }
}
