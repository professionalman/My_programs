// https://www.geeksforgeeks.org/generating-subarrays-using-recursion/
public class Gfg_easy_GeneratingAllSubarrays {
  //recursive approach
  //algo
  /* generatesubarray(arr, 0, 0) -> [1]
    |
    v
generatesubarray(arr, 0, 1) -> [1 2]
    |
    +---> generatesubarray(arr, 1, 1) -> [2]
    |
    v
generatesubarray(arr, 0, 2) -> [1 2 3]
    |
    +---> generatesubarray(arr, 1, 2) -> [2 3]
    |
    +---> generatesubarray(arr, 2, 2) -> [3]
    |
    v
generatesubarray(arr, 0, 3) -> END
*/
/*
 * base condition - end == arr.length (return)
 * else make start 0 and increment end by 1 if start > end 
 * else print using loop , then print end , then increment start so that it can do recursive 
 */
  public static void generatesubarray(int arr[], int start , int end){
    //base condition
    if(end==arr.length){
      return;
    }
    // If start exceeds end, reset start and move to the next 'end'
    else if (start> end){
      generatesubarray(arr, 0,end+1);
    }  
    // Print the subarray and continue recursion
    else{
      // Print the subarray
      System.out.print("[ ");
      for(int i = start;i<end;i++){
        System.out.print(arr[i]+" ");
      }
      System.out.println(arr[end]+" ]");
       // Continue with the next start for the same 'end'
      generatesubarray(arr, start+1, end);
    }
  }
  public static void main(String[] args) {
    int arr[] = {1,2,3};
    generatesubarray(arr,0,0);
  }
}
