        package Scanner;
import java.util.Scanner;
public class scanner3 {
    public static void main(String args[]){

        Scanner scan2 = new Scanner(System.in);

        System.out.print("enter your name: ");
        String name = scan2.nextLine();
        System.out.println("enter your age :");
        int age = scan2.nextInt();

        if(age>=18){
            System.out.println(name+" you are adult");
    
        } else {
            System.out.println(name+" you are minor");

        }    
    }
}

        
    