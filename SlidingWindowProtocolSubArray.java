package Arrays;

public class SlidingWindowProtocolSubArray {
	
	public static void subArrayWithSize(int[] arr, int k, int tar) {
		int pref[] = new int[arr.length];
		pref[0] = arr[0];
		for(int i = 1; i < arr.length; i++) {
			pref[i] = arr[i]+pref[i-1];
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i = 0; i < pref.length; i++) {
			System.out.print(pref[i]+" ");
		}
		System.out.println();
		if(pref[k-1] == tar) {
			for(int i = 0; i < k; i++) {
				System.out.print(arr[i]+" ");
			}
		}else {
			for(int j = k; j < arr.length; j++) {
				if((pref[j]-pref[j-k]) == tar) {
					for(int p = j-k+1; p <= j; p++) {
						System.out.print(arr[p]+" ");
					}
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = {1,2,8,6,7,4,3,6,2};
		int target = 11;
		int k = 3;
		subArrayWithSize(x, k, target);
		
	}

}
