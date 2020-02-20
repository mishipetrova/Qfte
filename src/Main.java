import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("a_example.txt");
        try {
            Scanner sc =new Scanner(file);
            String line  = sc.nextLine();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
