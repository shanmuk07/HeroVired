import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValidParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch: str.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else if(ch == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if(ch == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else if(ch == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a parenthesis to check: ");
        String str = sc.nextLine();
        if(isValidParenthesis(str)){
            System.out.println("Parenthesis is valid");
        }else{
            System.out.println("Parenthesis in not valid");
        }
        sc.close();
    }
}
