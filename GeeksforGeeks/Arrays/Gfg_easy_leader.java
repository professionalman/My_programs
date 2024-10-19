import java.util.*;
//algo
/* make arraylist temp
 * iterate the i 
 * inside i declare j
 * Iterate j and start j with i+1 so that j can search all the elements after above ith element
 * check if (arr[i]<arr[j]) means its not leader element
 * if j = n meaning the ith element is leader
  * add that element in arraylist
*/
class Gfg_easy_leader{
  static ArrayList<Integer> result(int arr[],int n){
    ArrayList<Integer> temp = new ArrayList<>();
    for(int i = 0;i<n;i++){
      int j;
      for(j = i+1;j<n;j++){
        if(arr[i]<arr[j]){
          break;
        }
      }
      if(j==n){
        temp.add(arr[i]);
      }
    }
    return temp;
  }
  public static void main(String args[]){
    int arr[] = {16,17,4,3,5,2};
    ArrayList<Integer> arry = result(arr,arr.length);
    for(int res:arry){
      System.out.print(res+" ");
    }
  }
}