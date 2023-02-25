package Strings;
import java.util.*;
public class Anagram {
	public static boolen isAnagram(String st1, String st2){
		if(s.length() != t.length()){
            		return false;
		}
		char arr1[] = s.toCharArray();
		char arr2[] = t.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st ="21a";
		String st1 = "21b";
		isAnagram(st, st1);
	}

}
