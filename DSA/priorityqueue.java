package DSA;
import java.util.PriorityQueue;
public class priorityqueue {
    public static void main(String args[]){
    PriorityQueue<Integer> Queue=new PriorityQueue<>();

    Queue.offer(3);
     Queue.offer(6);
     Queue.offer(4);
     Queue.offer(2);
     Queue.offer(5);

System.out.println(Queue);
System.out.println("first queue: " +Queue.peek());
System.out.println(Queue.poll());
System.out.println(Queue.poll());
System.out.println("Queuesize:" +Queue.size());
System.out.println("Queue empty:" +Queue.isEmpty());
System.out.println(Queue);
}
}

