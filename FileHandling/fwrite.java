package FileHandling;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class fwrite {
public static void main(String args[]){
    try{
        File file = new File("laddu.txt");
    Scanner scann = new Scanner(file);
    while  (scann.hasNextLine()) {
        String line = scann.nextLine();
        System.out.println(line);
    }
    scann.close();
} catch (FileNotFoundException e) {
    System.out.println("error occured: " + e.getMessage());
}
}
    }

