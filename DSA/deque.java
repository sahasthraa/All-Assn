package DSA;
import java.util.ArrayDeque;
import java.util.Deque;
public class deque {
    public static void main(String args[]){
        Deque<Integer> Deque=new ArrayDeque<>();
        Deque.addFirst(4);
        Deque.addFirst(2);
        Deque.addLast(5);
        Deque.addLast(1);
        Deque.addLast(3);

        System.out.println("Deque :"+Deque);
        System.out.println(Deque.peekFirst());
        System.out.println(Deque.peekLast());
        System.out.println(Deque.pollFirst());
        System.out.println(Deque.pollLast());
        System.out.println(Deque.size());
        System.out.println(Deque.isEmpty());
        System.out.println(Deque);
    }
}

