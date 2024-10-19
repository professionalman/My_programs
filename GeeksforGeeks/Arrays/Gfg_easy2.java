
// Find Second largest element in an array
//link - https://www.geeksforgeeks.org/find-second-largest-element-array/
//algo
/*find array.lenghth 
 * do reverse loop 
 * check if last element is striclty greater than other elements
 * if true then print the value
 * return
 * loop end
 * otherwise print no second largest element
 */
import java.util.Arrays;

public class Gfg_easy2 {
  public static void main(String[] args) {
    int arr[] = {3,2,5,7,4,7,3};
    findsecondlargest(arr);
  }
  public static void findsecondlargest(int arr[]){
    Arrays.sort(arr);
    int n = arr.length;
    for(int i = arr.length-1;i>=0;i--){
      System.out.println(arr[i]);
      if(arr[n-1]>arr[i]){
        System.out.println("value is " + arr[i]);
        return;
      }
    }
    System.out.println("there is no second largest element in given array.");
  }
}

