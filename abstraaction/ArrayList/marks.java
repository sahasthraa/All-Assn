package ArrayList;

import java.util.ArrayList;
public class marks {

    public static void main(String args[]){
        ArrayList<String> mks= new ArrayList<>();
   mks.add("sahasthra " );
   mks.add("vaishnavi");
   mks.add("sathwika");
   mks.add("meghana");
   mks.add( 2,"laddu");
   mks.set(4,"maggie");
   
   System.out.println("marks :" + mks);
   System.out.println(mks.size());
    }



    
}
