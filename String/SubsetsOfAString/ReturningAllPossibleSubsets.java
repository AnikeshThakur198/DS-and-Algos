package StringImpQstions;
import java.util.*;

public class AllPossibleSubsets {
	public static String[] subsets(String str, int j, int k, String [] ans){
		if(str.length() == 1){
			ans[k] = str;
			return ans;
		}
		for(int i = 1; i<= str.length();i++){
			ans[k] = str.substring(j, i);
			k++;
		}
		return subsets(str.substring(1), 0, k, ans);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		String[] ans = new String[(n*(n+1))/2];
		String [] strArray = subsets(str, 0, 0, ans);
		for(int i=0; i< strArray.length; i++){
			System.out.println(strArray[i]);
		}
		sc.close();
	}
}


// The subset of a string is the character or the group of characters that are present inside the string.
/**
 *  There could possibly be:
 *  
 *   		n(n+1)/2
 *   
 *   number of subsets for a string, where n is the length of the string.
*/