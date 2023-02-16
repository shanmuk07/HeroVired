import java.util.ArrayList;

public class StacksDemo {
    static ArrayList<Integer> stack = new ArrayList<>();
    public static void push(int value){
        stack.add(value);
    }
    public static int pop(){
        if(stack.size() == 0){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.remove(stack.size()-1);
    }
    public static int peek(){
        if(stack.size() == 0){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.get(stack.size()-1);
    }
    public static void printStack(){
        for(int ele: stack){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        printStack();
        pop();
        printStack();
        pop();
        printStack();
    }
}
