import java.io.*;
import java.util.List;

public class SolutionWriter {

    private String filename;

    public SolutionWriter(String filename){
        this.filename = filename;
    }


    public void writeToFile(List<Pair<Library,List<Book>>> solution){
        File file = new File(filename);
        try {
            FileWriter out = new FileWriter(file);

            PrintWriter printWriter =new PrintWriter(out);


            printWriter.println(solution.size());
            for(Pair<Library,List<Book>> l : solution){

                    printWriter.print(l.getFst().getId());
                    printWriter.print(" ");
                    printWriter.print(l.getSnd().size());
                    printWriter.println();


                        for(Book b : l.getSnd()){
                            printWriter.print(b.getId());
                            printWriter.print(" ");
                        }
                        printWriter.println();

            }
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
