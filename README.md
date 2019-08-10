# DS-and-Algos
This Repo basically contains various types of Algorithm and DS questions with their solutions

1.) Kadane's Algorithm(Largest Sum Contiguous Subarray):

      Initialize:
      max_so_far = 0
      max_ending_here = 0

      Loop for each element of the array
        (a) max_ending_here = max_ending_here + a[i]
        (b) if(max_ending_here < 0)
                  max_ending_here = 0
        (c) if(max_so_far < max_ending_here)
                  max_so_far = max_ending_here
      return max_so_far
      
   This Algorithm is used to find the Largest Sum Possible of a Contigious SubArray in agiven Array.
   
   
 2.) Anagram:
 
      In Data-structure's an Anagram of a string is another string that has same set of characters but are in
      different order. For example:
      
            str1: "triangle",
            str2: "integral"
            
      both str1 and str2 are anagrams of each other.      
