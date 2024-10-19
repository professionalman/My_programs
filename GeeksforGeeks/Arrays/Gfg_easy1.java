
// Find the largest three distinct elements in an array
//link - https://www.geeksforgeeks.org/find-second-largest-element-array/

//Algo
/* Make three variables - First = Second = third = Integer.MIN_VALUE
 * check if array length is smaller then return
 * Iterate till array length
 *    check if ith element is greater than first or not
 *    if yes then assign second to third, first to second and ith element to first
 *    else if ith element is greater than second
 *    if yes then assign second to third and ith element to second
 *    else if ith element is greater than third
 *    if yes then assign ith element to third
 * close iteration
 * print the values
*/


//code
public class Gfg_easy1{
  public static void main(String[] args) {
    int arr[]= {12, 13, 1, 10, 34, 1};
    printLargestThree(arr);
  }
  public static void printLargestThree(int arr[]){
    int first,second,third;
    first = second = third = Integer.MIN_VALUE;
    if(arr.length < 3){
      System.out.println("Invalid input");
      return;
    }
    for(int i = 0; i<arr.length;i++){
      if(arr[i]>first){
        third = second;
        second = first;
        first = arr[i];
      }
      else if (arr[i]> second) {
        third = second;
        second = arr[i];  
      } 
      else if(arr[i]>third){
        third= arr[i];
      }
    }
    System.out.println("The three values are "+first+", "+second+" and "+ third);
  }
}

