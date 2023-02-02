import java.util.Scanner;

public class naturalNumbersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = calculateSum(n);
        System.out.println(sum);
    }
    public static int calculateSum(int n){
        if(n <= 1){
            return 1;
        }
        return n+calculateSum(n-1);
    } 
}
