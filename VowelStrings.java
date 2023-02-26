package Strings;
import java.util.*;
public class VowelStrings {
	
	public static boolean isVowelString(String str) {
		String s = "aeiou";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			ch = Character.toLowerCase(ch);
		/*	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				return true;
			} */
			
			if(s.contains(ch+"")) {
				return true;
			}
		}
		
		
		return false;
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if(isVowelString(str)) {
			System.out.println(str + " is a vowel string");
		}else {
			System.out.println(str + " is not a vowel string");
		}
		sc.close();
	}

}
