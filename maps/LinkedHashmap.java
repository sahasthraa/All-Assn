package maps;
import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashmap {
    public static void main(String args[]){
        LinkedHashMap<String ,String> contact=new LinkedHashMap<>();

        contact.put("laddu","701070923");
        contact.put("annayya","7337287099");
        contact.put("chinnanniya","9676978527");
        contact.put("nannamma","868846696");
        contact.put("laddu","7601070923");
        contact.put("daddy","9866865338");

        System.out.println("contacts:" +contact);
       System.out.println(contact.get("nannamma"));
       contact.remove("laddu");
       System.out.println(contact);



    }
}
