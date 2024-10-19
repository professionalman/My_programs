
// Move all zeroes to end of array

//algo
/* make a variable count 
 * iterate array
 * check if array element is not eqaul to zerors or not
 * if it is not then count++ index put ith element
 * end loop
 * iterate till count < array length
 * put zeroes to what's left
 */

public class Gfg_easy3 {
public static void main(String[] args) {
  int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
  int n = arr.length;
  pushZerostoEnd(arr,n);
  for (int i : arr) {
    System.out.print(i+" ");
  }
}

static void pushZerostoEnd(int arr[],int n){
  int count = 0;
  for(int i = 0;i<n;i++){
    if(arr[i]!=0){
      arr[count++] = arr[i];
    }
  }
  while(count<n){
    arr[count++]=0;
  }
}
}
