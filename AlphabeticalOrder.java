package Strings;

import java.util.*;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String str[] = line.split(" ");
		Arrays.sort(str);
		for(String i: str) {
			System.out.print(i + " ");
		}
	}

}
