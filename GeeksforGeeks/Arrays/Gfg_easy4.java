

import java.util.Arrays;

public class Gfg_easy4{
  // function to rearrange the elements
  // in array such that even positioned are
  // greater than odd positioned elements


  //algo
  //Note : i%2==1 will work as even number as index starts from 0 so 0,2,4 is acutally even places
  /* sort the array
   * make new array
   * make two pointer - one is start index and another is for end index
   * start loop till n
   * check if(i%2==1){
   * assign ans[i] = arr[endpointer--]}
   * else
   *    ans[i] = arr[startPointer++]
   */
//   static void assign(int arr[], int N)
//   {
//       // Sort the array
//       Arrays.sort(arr);
     
//       int ans[] = new int[N];
//       int ptr1 = 0, ptr2 = N - 1;
//       for (int i = 0; i < N; i++) {

//           // Assign even indexes with maximum elements
//           if (i % 2 == 1)
//               ans[i] = arr[ptr2--];

//           // Assign odd indexes with remaining elements
//           else
//               ans[i] = arr[ptr1++];
//       }
      
//       // Print result
//       for (int i = 0; i < N; i++)
//           System.out.print(ans[i] + " ");
//   }



//algo
/*
 * start with iteration from 1 because we have to comapare the previous element with current
 *  check if (i+1) is divisible by 2 or not because in 1 based index its 2 = even 
 *  if true then check if presented number is greater or not if not then swap
 * 
 * else check if odd place has lower number or not
 * if not swap the numbers
 */
static void assign(int arr[],int N){
    for(int i = 1;i<N;i++){
        // Check if the index is even (1-based) => i+1 is even
        if((i+1) % 2 ==0){
            // check if previous one is greater than current
            if(arr[i]<arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }
        else{
            if(arr[i]>arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
            }
        }
    }
}


  // Driver code
  public static void main(String args[])
  {
      int arr[] = { 10,7,8,6,9,7 };
      int N = arr.length;
      assign(arr, N);
      for (int i : arr) {
        System.out.print(i+" ");
        
      }
      
  }
}