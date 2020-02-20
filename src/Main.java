
import jdk.internal.util.xml.impl.Input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "f_libraries_of_the_world.txt";
       InputReader reader =  new InputReader(fileName);

        /*
        List<Pair<Library,List<Book>>> solution = new ArrayList<>();
        List<Library> libraries  = reader.getLibraries();
        libraries.sort(Collections.reverseOrder(new LibraryComparator()));

        System.out.println(reader.getNumOfDays());
        //libraries.sort(new LibraryComparator());
        HashSet<Book> visited =new HashSet<>();
        for(Library l : libraries){
            List<Book> books = new ArrayList<>();
            System.out.println(l.getDays());
            if(l.getDays() < reader.getNumOfDays()){
                for(Book b : l.getBooks()){
                    if(!visited.contains(b)){
                        books.add(b);
                        visited.add(b);
                    }
                }
                if(books.size()>0){
                    solution.add(new Pair<>(l,books));

                }
            }
        }*/
        List<Pair<Library,List<Book>>> solution = new ArrayList<>();
        List<Library> libraries = reader.getLibraries();
        libraries.sort(Collections.reverseOrder((a,b) -> a.CalculateLibraryScoreM().getFst() - b.CalculateLibraryScoreM().getFst()));
        for(Library l : libraries){
            if(l.getBooks().size()>0 && l.CalculateLibraryScoreM().getSnd().size() > 0){
                solution.add(new Pair<>(l,l.CalculateLibraryScoreM().getSnd()));
            }
        }




        SolutionWriter writer = new SolutionWriter("solution.txt");
        writer.writeToFile(solution);
    }



}
