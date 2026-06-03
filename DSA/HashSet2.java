package DSA;
import java.util.HashSet;
import java.util.List;

public class HashSet2 {
public static void main(String args[]){
    HashSet<String> setA=new HashSet<>(List.of("laddu","munna","tuttu","laddu"));
    HashSet<String> setB=new HashSet<>(List.of("gundushiva","vaishu","yashash","laddu","vaishu"));

System.out.println("setA:" +setA);
System.out.println("setB:" +setB);
setA.remove("laddu");

System.out.println("is laddu present in setA: "+setA.contains("laddu"));
System.out.println(setA.size());
System.out.println(setB.size());
setB.addAll(setA);
System.out.println("All names:" +setB);
setB.retainAll(setA);
System.out.println("removing setA from setB:" +setB);
setA.add("laddu");
setA.removeAll(setB);
System.out.println(setA);
System.out.println(setB);
}

}