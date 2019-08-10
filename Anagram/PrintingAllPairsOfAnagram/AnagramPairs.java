package StringImpQstions;
import java.util.*;

public class AnagramPairs {
	public static boolean checkAnagram(char []arr1, char []arr2,int n1,int n2){
		int i=0;
        if(n1 == 0){
            return true;
        }
        
        char c = arr1[n1 - 1];
        for(; i<n2; i++){
            if(c == arr2[i]){
                break;
            }
        }if(i == n2){
            return false;
        }
        
        return checkAnagram(arr1, arr2, n1-1, n2);
	}
	public static void AnagramPair(String str1, String str2){
		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();
		if(checkAnagram(charArr1, charArr2, str1.length(), str2.length())){
			System.out.println(str1+", "+str2);
			return;
		}else{
			return;
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the string array");
		int n = sc.nextInt();
		String[] strArr = new String[n];
		for(int i=0; i< n;i++){
			strArr[i] = sc.next();
		}
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(strArr[i].length() == strArr[j].length()){
					AnagramPair(strArr[i], strArr[j]);
				}
			}
		}
		sc.close();
	}
}
