package FileHandling;
import java.io.IOException;
import java.io.File;
public class FH {
    
    public static void main(String args[]){
        
        try{
            File file = new File("laddu.txt");
            if(file.createNewFile()){
                System.out.println("file created: " + file.getName());
            } else {
                System.out.println("file already exists.");

            }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        }

