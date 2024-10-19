//https://www.geeksforgeeks.org/rearrange-array-maximum-minimum-form/

//algo 
/*Two Pointers technique and Using flag = !flag
 * (Assuming that array is sorted)
 * make temporay array of size as original array 
 * create two pointers small for 0 and large for n-1
 * iterate array 
 * check flag 
 * if true add larger pointer position array
 * if not add small pomiter position array into temp
 * 
 * after loop finally assign temp array to original array
 *  
*/
public class Gfg_easy5 {
  static void rearrange(int arr[], int len){
    int temp[] = new int[len];
    int small = 0,large = len-1;
    boolean flag = true;
//using two pointer technique
    for(int i = 0;i<len;i++){
      if(flag){
        temp[i] = arr[large--];
      }
      else{
        temp[i] = arr[small++];
      }
      flag =!flag; //Make true to false and vice versa      
    }
   for(int i = 0;i<len;i++){
    arr[i]= temp[i];
   }
  }
  public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6};
      int len = arr.length;
      System.out.println("Original Array");
      for (int i : arr) {
        System.out.print(i + " ");
      }
      rearrange(arr,len);
      System.out.println("After conversion");
      for (int i : arr) {
        System.out.print( i+" ");
      }
  }
}
