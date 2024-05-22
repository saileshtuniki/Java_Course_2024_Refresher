import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQEx1 {
    public static void main(String[] args) {
        
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        // PriorityQueue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(24);
        pq.offer(54);
        pq.offer(19);
        pq.offer(14);

        pq.add(16);

        System.out.println(pq);

        pq.poll();

        System.out.println(pq);
        System.out.println(pq.peek());


    }
}
