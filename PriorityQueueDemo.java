import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(5);
        queue.add(7);
        queue.add(2);
        System.out.println("Priority Queue: "+queue);

        System.out.println("The highest priority element: " + queue.peek());

        System.out.println("Removing the highest priority element: "+queue.poll());

        System.out.println("Priority Queue: "+queue);
    }
}
