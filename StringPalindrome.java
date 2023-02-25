package Strings;
import java.util.*;
public class StringPalindrome {
	
	public static boolean isPalindrome(String str) {
		int n = str.length();
		for(int i = 0; i <= n/2; i++) {
			if(str.charAt(i) != str.charAt(n-i-1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(isPalindrome(str)) {
			System.out.println(str + " is a palindrome");
		}else {
			System.out.println(str + " is not a palindrome");
		}
	}

}
