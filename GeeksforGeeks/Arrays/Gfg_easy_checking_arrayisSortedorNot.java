//Two approaches
public class Gfg_easy_checking_arrayisSortedorNot {

  //recursive approach
  static boolean arraycheck(int arr[], int n){
    if(n==0||n==1){
      return true;
    }
    return arr[n-1]>arr[n-2] && arraycheck(arr, n-1);
  }
  // //iterative approach
  //  static boolean arraycheck(int arr[],int n){
  //   //base condition
  //   if(n==0|| n==1){
  //     return true;
  //   }
  //   //checking previous element is sorted or not
  //   for(int i = 1;i<n;i++){
  //     if(arr[i-1]>arr[i]){
  //       return false;
  //     }
  //   }
  //   return true;
  // }
  public static void main(String[] args) {
    int arr[] = {1,2,4,5,6,8,9};
    int n = arr.length;
    if(arraycheck(arr,n)){
      System.out.println("Array is sorted");
    }
    else{
      System.out.println("Array is not sorted");
    }
  }
}
