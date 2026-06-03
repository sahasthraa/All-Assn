package ArrayList;
import java.util.ArrayList;

public class rollno{

    public static void main(String args[]){
        ArrayList<Integer> rno=new ArrayList<>();
        rno.add(21);
        rno.add(22);
        rno.add(23);
        rno.add(24);
        rno.add(25);
        rno.add(5,26);
        rno.set(2,22);

       System.out.println(rno.size());
 System.out.println("rollno:" +rno);

        
    }

}





