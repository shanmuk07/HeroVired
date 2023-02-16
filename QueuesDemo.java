import java.util.*;
public class QueuesDemo {
    static ArrayList<Integer> queue = new ArrayList<>();
    public static void push(int value){
        queue.add(value);
    }
    public static int pop(){
        if(queue.size() == 0){
            System.out.println("Stack is empty");
            return -1;
        }
        
        return queue.remove(0);
    }
    public static void printQueue(){
        for(int ele: queue){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static int top(){
        if(queue.size() == 0){
            System.out.println("Queue is empty");
        }
        return queue.get(0);
    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        printQueue();
        pop();
        printQueue();
        pop();
        printQueue();
    }
}
