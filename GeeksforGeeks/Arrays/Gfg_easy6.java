// https://www.geeksforgeeks.org/segregate-even-odd-numbers-set-3/

//algo
/* assign i = -1
 * start iteration till n
 * check if jth element is divisible by two 
 * if yes then increment i and swap it with jth
 * end if
 * increment j
 * end while
 */
public class Gfg_easy6 {
  static void arrayEvenandOdd(int arr[],int n){
    int i = -1,j=0;
    while(j!=n){
      if(arr[j]%2==0){
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
      j++;
    }
    for (int p : arr) {
      System.out.print(p+" ");
      
    }
  }
  public static void main(String[] args) {
    int arr[] = {1,3,2,4,7,6,9,10};
    int len = arr.length;
    arrayEvenandOdd(arr,len);
  }
}
