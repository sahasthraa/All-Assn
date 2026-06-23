package Scanner;
import java.util.Scanner;
public class Scannerdtypes{

     public static void main(String[] args) {
        
Scanner scan3 = new Scanner(System.in);
System.out.print("enter your name: ");
String name = scan3.nextLine();
System.out.print("enter your percntage: " );
Double percntage= scan3.nextDouble();
System.out.print("enter your salary: ");
int salary = scan3.nextInt();
System.out.print("are you HR : ");
Boolean hr = scan3.nextBoolean();
System.out.print("enter your mobile number: ");
Long mno = scan3.nextLong();

scan3.close();
System.out.println("hi " + name+ " you are HR , your percentage is "+percntage+" and your salary is "+salary+" your mobile number is: "+mno+"thankyou");





    }}




