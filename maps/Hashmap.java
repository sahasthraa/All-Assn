package maps;
import java.util.HashMap;
import java.util.Map;

public class Hashmap{
    public static void main(String args[]){
    HashMap<String,String> groceryList=new HashMap<>();
 
    groceryList.put("tomato","2kg");
    groceryList.put("potato","1kg");
    groceryList.put("surf excel","1packet");
    groceryList.put("rice bag","25kg");
    groceryList.put("potato","2kg");
    groceryList.put("onion","5kg");
    groceryList.put("sugar","5kg");
    groceryList.put("atta","1kg");
    groceryList.put("tea powder","1kg");


    System.out.println("groceryList: " + groceryList);
    System.out.println(groceryList.get("surf excel"));
    System.out.println(groceryList.get("potato"));
    System.out.println(groceryList.getOrDefault("onion","not found"));
    System.out.println(groceryList.containsKey("ginger"));
    System.out.println(groceryList.containsValue("25kg"));
    groceryList.remove("atta");
    System.out.println("groceryList:" +groceryList);
}
}