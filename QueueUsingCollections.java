import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingCollections {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println("Queue Elements: "+queue);
        System.out.println("Size of the queue: "+queue.size());
        System.out.println("Top Element: "+queue.peek());
        System.out.println("Popped element: "+queue.remove());
    }
}
