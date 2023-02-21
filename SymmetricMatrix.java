package Arrays;
import java.util.*;
import java.util.Scanner;

public class SymmetricMatrix {
	
	public static String symmetricMatrix(int[][] arr, int r, int c) {
		for(int i = 0; i < r; i++) {
			for(int j = 0; j <= i; j++) {
				if(arr[i][j] != arr[j][i]) {
					return "No";
				}
			}
		}
		
		for(int i = 1; i < r; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i][j] != arr[j][i]) {
					return "No";
				}
			}
		}
		
		
		return "Yes";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows, cols, arr[][];
		rows = sc.nextInt();
		cols = sc.nextInt();
		arr = new int[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print(symmetricMatrix(arr, rows, cols));
		
		sc.close();
	}

}
