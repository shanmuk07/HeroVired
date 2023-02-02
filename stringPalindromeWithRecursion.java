import java.util.Scanner;

public class stringPalindromeWithRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        int startIndex = 0, endIndex = str.length()-1;
        if(isPalindrome(str, startIndex, endIndex)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str +" is not a palindrome");
        }
    }
    public static boolean isPalindrome(String str, int i, int j){
        if(str.charAt(i) != str.charAt(j)){
            return false;
        }
        if(i <= j){
            i++;
            j--;
            isPalindrome(str, i, j);
        }
        return true;
    }

}
