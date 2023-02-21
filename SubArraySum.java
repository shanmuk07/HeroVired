package Arrays;
import java.util.*;
public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int targetSum = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int i = 0, j = 0, cum_sum = 0, found = 0;
		while(true) {
			if(i > n || j > n) {
				found = 1;
				break;
			}
			if(targetSum == cum_sum) {
				break;
			}
			if(cum_sum > targetSum) {
				cum_sum -= a[j++];
			}else {
				i++;
				if(i >= n) {
					break;
				}else {
					cum_sum = a[i];
				}
			}
			
		}
		ArrayList<Integer> al = new ArrayList<>();
		if(found == 1) {
			al.add(-1);
		}else {
			al.add(j+1);
			al.add(i);
		}
		for(Integer m: al) {
			System.out.print(m+" ");
		}
	}

}
