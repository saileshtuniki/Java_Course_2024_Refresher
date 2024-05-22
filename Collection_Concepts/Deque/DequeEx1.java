import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeEx1 {
    public static void main(String[] args) {
        Deque <Integer> dq = new ArrayDeque<>();
        // Deque <Integer> dq = new LinkedList<>(); // same as ArrayDeque

        dq.offer(11);
        dq.offer(24);
        dq.offerLast(12);
        dq.offerFirst(13); 

        System.out.println("dq:"+dq);


        System.out.println("Peek:" +dq.peek());
        System.out.println("peekFirst:" +dq.peekFirst());
        System.out.println("peekLast:" +dq.peekLast());

        System.out.println(dq.poll());
        System.out.println("poll(): " + dq);

        System.out.println(dq.pollFirst());
        System.out.println("pollFist(): " + dq);

        System.out.println(dq.pollLast());
        System.out.println("pollLast(): " + dq);


    }
}
