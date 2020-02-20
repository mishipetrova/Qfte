import java.awt.image.AreaAveragingScaleFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("a_example.txt");
        List<Library> libraries = new ArrayList<>();
        Map<Integer,Integer> scoreMap = new HashMap<Integer,Integer>();

        try {
            Scanner sc =new Scanner(file);
            String line  = sc.nextLine();
           String[] strings =   line.split(" ");
           int numOfBooks = Integer.parseInt(strings[0]);
           int numOfLibraries = Integer.parseInt(strings[1]);
           int days = Integer.parseInt(strings[2]);
           line = sc.nextLine();
           strings = line.split(" ");
           for(int i = 0 ;i < strings.length;i++){
               System.out.println( "Book " + i + " has score: " + Integer.parseInt(strings[i]));
               scoreMap.put(i,Integer.parseInt(strings[i]));
           }

           for(int i = 0; i < numOfLibraries;i++){
               line = sc.nextLine();
               strings = line.split(" ");

               System.out.println( "Library " + i + " has num of books " + strings[0] + " signup time " + strings[1] +  " and number of books per day " + strings[2]);
               int numBooks = Integer.parseInt(strings[0]);
                int signup = Integer.parseInt(strings[1]);
                int booksPerDay = Integer.parseInt(strings[2]);
                List<Book> books = new ArrayList<>();

               line = sc.nextLine();
               strings = line.split(" ");
               for(String s : strings){
                   books.add(new Book(Integer.parseInt(s),scoreMap.get(Integer.parseInt(s))));
                   System.out.print( "Book ID " + Integer.parseInt(s) + " ");
               }
               libraries.add(new Library(i,books,signup,booksPerDay));
               System.out.println();
           }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
