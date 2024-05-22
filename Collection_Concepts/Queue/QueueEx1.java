import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {
    public static void main(String[] args) {
        Queue <Integer> queue = new LinkedList<>();

        queue.offer(12);
        queue.offer(15);
        queue.offer(13);
        
        queue.add(16);


        System.out.println(queue);
        System.out.println(queue.poll());

        System.out.println(queue);

        System.out.println(queue.peek());
    }
}
