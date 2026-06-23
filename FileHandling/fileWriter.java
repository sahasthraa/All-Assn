package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class fileWriter {
    public static void main(String args[]){
        try{

        
    
    FileWriter writer = new FileWriter("sahasthra.txt");
    writer.write("hello! sahasthra, welcome to skillsprint");
   writer.close();
   System.out.println("successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }



        }
        }

