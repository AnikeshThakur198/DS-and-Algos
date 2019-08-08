/** KADANE'S APPROACH*/
// Only applicable to those arrays that has at-least one single positive value 


import java.util.*;

class Maxima{
	public static int maxOf(int arr[], int size){
		int max_ending_here = 0;
		int max_so_far = 0;
		for(int i=0; i<size; i++){
			max_ending_here = max_ending_here + arr[i];
			if(max_ending_here < 0){
				max_ending_here = 0;
			}
			else if(max_ending_here>max_so_far){
				max_so_far = max_ending_here; // If the max_ending_here value exceeds the max_so_far we take it as current max.	
			}
		}
		return max_so_far;
	}
}

class Main{
	public static void main(String args[]){
		Maxima mx = new Maxima();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		int max = mx.maxOf(arr,n);
		System.out.println(max);
	}
}

/**
Kadane's Approach:-
		Kadane's Approach was to use to data variables named as:
		- max_ending_here
		- max_so_far
						in which the *max_ending_here* use to keep track of the 
		values of the sub-array that has the maximum sum while the max_so_far
		used to store the maximum value of the sub-array till that point in the
		array.
		
	Note:- 	THIS APPROACH WILL ONLY APPLICABLE TO THOSE ARRAYS WHICH HAS ATLEAST 
		ONE POSITIVE VALUE.
*/