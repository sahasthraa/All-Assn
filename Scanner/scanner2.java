package Scanner;
import java.util.Scanner;
public class scanner2 {
    public static void main(String args[]){
  Scanner scan1 = new Scanner(System.in);

  System.out.print("enter a number: ");
  int num = scan1.nextInt();

  if(num>=0) {
    System.out.println(num + " is positive");

  } else {
    System.out.println(num +" is negative");
  }

    }
}
