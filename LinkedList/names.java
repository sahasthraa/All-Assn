package LinkedList;
import java.util.LinkedList;

public class names {
public static void main (String args[]){

LinkedList<String>name=new LinkedList<>();
name.add("sahasthra");
name.add("vaishnavi");
name.add("sathwika");
name.add("meghana");
name.add("varshini");
name.removeFirst();
name.removeLast();
System.out.println("student names:" +name);
System.out.println(name.peek());

}
}