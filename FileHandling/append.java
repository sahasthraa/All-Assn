package FileHandling;
import java.io.FileWriter;
import java.io.IOException;

public class append {
   public static void main(String args[]){
    try{
        FileWriter writer = new FileWriter("laddu.txt",true);
        writer.write("hello! laddu welcome to Skillsprint");
        writer.close();
        System.out.println("msg appended successfully!");
   
    } catch (IOException e) {
         e.printStackTrace();

    }   } 
}
