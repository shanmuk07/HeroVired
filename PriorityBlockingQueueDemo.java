import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {
    public static void main(String[] args) {
        PriorityBlockingQueue<String> queue = new PriorityBlockingQueue<>();
        queue.add("Ajay");
        queue.add("Shanmukh");
        queue.add("Ganesh");
        System.out.println("Queue: "+queue);

        System.out.println("Highest Priority: "+queue.peek());

        System.out.println("removing: "+queue.poll());

        System.out.println("Queue: "+queue);

    }
}
