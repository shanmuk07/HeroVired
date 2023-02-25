package Strings;
import java.util.*;
public class StringSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        ArrayList<String> al = new ArrayList<>();
        for(int i = 0; i < n-1; i++){
            char ch = str.charAt(i);
            String st = "";
            if(Character.isDigit(ch)){
                st += ch;
                if(!Character.isDigit(str.charAt(i+1))){
                    al.add(st);
                    st = "";
                    i++;
                    continue;
                }
            }
        }
        int sum = 0;
        for(String s: al){
            sum += Integer.parseInt(s);
            
        }
        System.out.println(sum);

	}

}
