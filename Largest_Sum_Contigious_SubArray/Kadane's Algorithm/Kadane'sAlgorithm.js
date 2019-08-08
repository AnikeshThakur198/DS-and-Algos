/**
 * Kadane's Algorithm:
 *             This algo is used to find the Maximum Sum Possible in a SubArray in a given Array
 */

 function maxOf(arr, size){
    var max_ending_here = 0;
    var max_so_far = Number.MIN_SAFE_INTEGER;
    for(let i=0; i<size; i++){
        max_ending_here = max_ending_here + arr[i];
        if(max_so_far < max_ending_here){
            max_so_far = max_ending_here;
        }
        if(max_ending_here < 0){
            max_ending_here = 0;
        }
    }
    return max_so_far;
 }

 var arr = [-1, 2, 3, -4, 1, -2, -3];
 var max = maxOf(arr, arr.length);
 console.log(max);

 /**
  * Number.MIN_SAFE_INTEGER :
  *             The Number.MIN_SAFE_INTEGER constant represents the minimum safe integer in JavaScript (-(253 - 1)).
  */