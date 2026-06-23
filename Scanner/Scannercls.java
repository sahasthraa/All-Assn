package Scanner;

import java.util.Scanner;

public class Scannercls {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("enter your name: ");
    String name = scan.nextLine();
        System.out.print("enter gender :");
    String gen = scan.nextLine();

    System.out.print("enter your age: ");
    int age = scan.nextInt();
    System.out.print("percentage :");
    Double per = scan.nextDouble();

    System.out.println("hello " + name +  "you are  " +age+" years old " + " you are "+gen+" and your pecentage is " +per);
    scan.close();
    }
}