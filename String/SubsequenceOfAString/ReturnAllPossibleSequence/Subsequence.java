package StringImpQstions.ReturnAllPossibleSequence;
import java.util.*;

public class Subsequence {
	public static String [] subsequence(String str){
		if(str.length() == 0){
			String ans [] = {""};
			return ans;
		}
		
		// smallAns array will store answer of the smaller problem
		String [] smallAns = subsequence(str.substring(1));
		String [] ans = new String[2 * smallAns.length];  // length of the ans array will be twice of the length of smallAns
		
		for(int i=0; i<smallAns.length; i++){
			ans[i] = smallAns[i];
		}
		
		for(int i=0; i<smallAns.length; i++){
			ans[i + smallAns.length] = str.charAt(0) + smallAns[i];
		}
		
		return ans;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String whose subsequence you want to return");
		String str = sc.next();
		String ans[] = subsequence(str);
		for(String i : ans){
			System.out.println(i);
		}
		sc.close();
	}
}
