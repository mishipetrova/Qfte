
import jdk.internal.util.xml.impl.Input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "a_example.txt";
       InputReader reader =  new InputReader(fileName);
       List<Library> libs = reader.getLibraries();
       SolutionWriter solutionWriter = new SolutionWriter("third-incabula-answers.txt" );

       Runner runner = new Runner( libs, solutionWriter, reader.getNumOfDays() );
       runner.run();
    }



}
