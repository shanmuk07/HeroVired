import java.util.*;
public class StackUsingCollections {
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		System.out.println("Is stack empty ? "+st.isEmpty());
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println("Stack Elements: " + st);
        System.out.println("Size of the stack: "+ st.size());
		System.out.println("Top Element: " + st.peek());
		System.out.println("Popped Element: " +st.pop());
		System.out.println("Top Element: " + st.peek());
		System.out.println("Popped Element: " +st.pop());

        st.clear();
        System.out.println("Size of the stack: "+ st.size());
        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        st.addAll(al);
        System.out.println("Stack Elements: " + st);
        System.out.println("Top Element: " + st.peek());
		System.out.println("Popped Element: " +st.pop());
	}
}
