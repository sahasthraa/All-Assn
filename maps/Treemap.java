package maps;
import java.util.TreeMap;
import java.util.Map;
public class Treemap {
    public static void main(String args[]){

     TreeMap<String,Integer> names=new TreeMap<>();
       
names.put("yamuna",1);
names.put("ganga",2);
names.put("krishna",3);
names.put("parvathi",4);
names.put("lakshmi",5);
names.put("saraswathi",6);


System.out.println("names: "+names);
System.out.println(names.get("krishna"));
System.out.println(names.headMap("parvathi"));
System.out.println(names.tailMap("parvathi"));
System.out.println(names.firstKey());
System.out.println(names.lastKey());

}
}
