

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "c_incunabula.txt";
       InputReader reader =  new InputReader(fileName);
        HashSet<Book> visited = new HashSet<>();
//
//        List<Pair<Library,List<Book>>> solution = new ArrayList<>();
//        List<Library> libraries  = reader.getLibraries();
//        System.out.println(reader.getNumOfDays());
//        libraries.sort(new LibraryComparator());
//        for(Library l : libraries){
//            List<Book> books = new ArrayList<>();
//            System.out.println(l.getDays());
//            if(l.getDays() < reader.getNumOfDays()){
//                for(Book b : l.getBooks()){
//                    if(!visited.contains(b)){
//                        books.add(b);
//                        visited.add(b);
//                    }
//                }
//                if(books.size()>0){
//                    solution.add(new Pair<>(l,books));
//
//                }
//            }
//        }
//        SolutionWriter writer = new SolutionWriter("solution.txt");
//        writer.writeToFile(solution);


    }



}
