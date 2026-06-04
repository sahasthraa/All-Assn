package DSA;
import java.util.Stack;
public class Stack1 {

    public static void main(String args[]){
        Stack<String> participants=new Stack<>();

        participants.push("ramu");
        participants.push("bheemu");
        participants.push("somu");
        participants.push("daamu");

        System.out.println("participants:" +participants);
        System.out.println("first participant:" +participants.peek());
        
        System.out.println(participants);
        System.out.println("removed:" +participants.pop());
        System.out.println("removed:" +participants.pop());
        System.out.println("removed:" +participants.pop());
        System.out.println("removed:" +participants.pop());

        System.out.println(participants.isEmpty());
        System.out.println(participants.size());
        participants.push("somu");
        System.out.println(participants.search("somu"));
    }
}

