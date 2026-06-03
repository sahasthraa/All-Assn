package DSA;
import java.util.HashSet;
public class HashSet1 {
    public static void main(String args[]){

HashSet<String> fruits=new HashSet<>();

  fruits.add("orange");
  fruits.add("mango");
    fruits.add("apple");
    fruits.add("banana");
    fruits.add("kiwi");
    fruits.add("watermelon");
    fruits.add("banana");
    fruits.add("orange");



    System.out.println("fruits:" +fruits);
    System.out.println(fruits.size());
    System.out.println(fruits.contains("kiwi"));
    fruits.remove("kiwi");
    System.out.println(fruits.contains("kiwi"));
    }
}

