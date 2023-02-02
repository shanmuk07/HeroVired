import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPalindrome(num)){
            System.out.println(num+" is palindrome");
        }else{
            System.out.println(num+" is not palindrome");
        }
        sc.close();
    }
    public static boolean isPalindrome(int n){
        int count = (int)Math.log10(n);
        int found = 0;
        while(n > 0){
            int lastNum = n%10;
            int firstNum = n / (int)Math.pow(10, count);
            if(firstNum != lastNum){
                found = 1;
                break;
            }
            n = n % 10;
            n = n / 10;
            count = count-2;
        }
        if(found == 1){
            return false;
        }
        return true;
    }
}
