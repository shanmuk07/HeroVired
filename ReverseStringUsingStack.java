import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {
    public static String reverseString(String str){
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch: str.toCharArray()){
            stack.push(ch);
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String rev = reverseString(str);
        System.out.println("Original String: "+str);
        System.out.println("Reversed string: "+rev);
        sc.close();
    }
}
