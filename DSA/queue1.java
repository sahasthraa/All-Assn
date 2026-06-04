package DSA;
import java.util.Queue;
import java.util.LinkedList;

public class queue1 {
    public static void main(String args[]){
Queue<String> voters=new LinkedList<>();


voters.add("sahasthra");
voters.add("akshay");
voters.add("abhinav");
voters.add("vinod");
voters.add("kalyani");

System.out.println("voters:" +voters);
System.out.println("first voter: " +voters.peek());
System.out.println(voters.poll());
System.out.println(voters.poll());
System.out.println(voters.poll());
System.out.println(voters);

System.out.println(voters.size());
System.out.println(voters.isEmpty());

}     
}


