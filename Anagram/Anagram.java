import java.util.*;
import java.lang.*;

class Anagram {
	public static void anagram(char []arr1, char []arr2,int n1,int n2){
        int i=0;
        if(n1 == 0){
            System.out.println("YES");
            return;
        }
        
        char c = arr1[n1 - 1];
        for(; i<n2; i++){
            if(c == arr2[i]){
                break;
            }
        }if(i == n2){
            System.out.println("NO");
            return;
        }
        
        anagram(arr1, arr2, n1-1, n2);
    }
	
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
	    int T = 0;
	    if(sc.hasNext()) T = sc.nextInt();
	    
	    while(T-->0){
	        String str1 = sc.next(); String str2 = sc.next();
	        char charArr1[] = str1.toCharArray();
	        char charArr2[] = str2.toCharArray();
	        if(str1.length() != str2.length()){
	            System.out.println("NO");
	        }else{
	            anagram(charArr1, charArr2, str1.length(), str1.length());
	        }
	    }
	}
}