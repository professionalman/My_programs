import java.util.Collections;

public class Sorting {
  //---------------------------------------
  //quick sort 
  //time complexity - O(nlogn) , worst = O(n*n)
  // public void quicksort(int arr[], int l , int h){
  //   if(h>l){
  //     int pivotIdx = partition(arr,l,h);
  //     quicksort(arr, l, pivotIdx-1);
  //     quicksort(arr, pivotIdx+1, h);
  //   }
  // }

  // int partition(int arr[],int l , int h)
  // {
  //   int pivot = arr[h];
  //   int i = l-1;
  //   for(int j = l;j<h;j++)
  //   {
  //     if(arr[j]<pivot)
  //     {
  //       i++;
  //       //swap
  //       int temp = arr[i];
  //       arr[i] = arr[j];
  //       arr[j] = temp;
  //     }
  //   }
  //   i++;
  //   int temp = arr[i];
  //   arr[i] = arr[h];
  //   arr[h] = temp;
  //   return i;
  // }

  //another approach for partition function

  public void quicksort(int arr[], int l , int h){
    if(l<h){
      int pivotIdx = partition(arr,l,h);
      quicksort(arr, l, pivotIdx-1);
      quicksort(arr, pivotIdx+1, h);
    }
  }
  int partition(int arr[], int l , int h){
      int pivot = arr[l];
      int i = l;
      int j = h;
      while(i<j){
        while(arr[i]<=pivot&&i<=h-1){
          i++;
        }
        while(arr[j]>pivot&&j>=l+1){
          j--;
        }
        if(i<j){
          // int temp = arr[i];
          // arr[i] = arr[j];
          // arr[j] = temp;
          swap(arr,i,j);
        }
      }
      // int temp = arr[l];
      // arr[l]= arr[j];
      // arr[j] = temp;
      swap(arr,l,j);
      return j;
  }
  public void swap(int arr[],int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }



  //---------------------------------------
  //intersection sort - sorted in card system i.e. pick card from unsorted and put it in sorted deck place
  // time complexity - O(n*n)
  void intersectionsort(int ar[]){
    int n = ar.length;
    for(int i = 1; i<n ; i++)
    {
      int key = ar[i];
      int j = i-1;

      while(j>=0&& ar[j]>key)
      {
        ar[j+1] = ar[j] ;
        j--;
      }

      ar[j+1] = key;
    }
  }
  // --------------------------------------
  // bubble sort
  // time complexity - o(n) to O(n*n)
  // i < n-1 ; j < n-i-1
  void bubblesort(int arr[]){
    int n = arr.length;
    for (int i = 0; i < n -1; i++) {
      for (int j = 0; j < n-i-1; j++) {
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
  //----------------------------------------
  // selection sort
  //complexity - O(n*n) sp
  // select a element and compare it with all other elements and final swap it with the smallest element in array
  void selectionsort(int arr[])
  {
     int x = arr.length;

     for (int i = 0 ; i < x-1;i++)
     {
       int min_idx = i;

       for(int j = i+1 ;j<x;j++)
       {
        if(arr[min_idx]>arr[j])
              min_idx = j;
       }
        
        int temp = arr[min_idx];
        arr[min_idx] = arr[i];
        arr[i] = temp;

     }
  }
  
  //-----------------------------------------
  // merge sort 
  // time complexity - O(n logn)
  void divideMergesort(int ar[] , int l ,int r){
    if(l<r){
      int m = l+(r-l)/2;
      divideMergesort(ar, l, m);
      divideMergesort(ar, m+1, r);
      conquerMegersort(ar,l,m,r) ;
    }
  }
  void conquerMegersort(int ar[],int l , int m , int r){
    int n1 = m-l+1; // length for ar1
    int n2 = r-m;   // length for ar2

    int ar1[] = new int[n1];
    int ar2[] = new int[n2];

    for(int i =0;i<n1;++i){
      ar1[i] = ar[l+i];
    }
    for(int j =0;j<n2;++j){
      ar2[j] = ar[m+1+j];
    }
    int i =0,j=0;
    int k = l;
    while(i<n1&&j<n2)
    {
      if(ar1[i]<=ar2[j])
      {
        ar[k] = ar1[i];
        i++; 
      }

      else{
      ar[k] = ar2[j];
      j++;}

      k++;
    }
    while(i<n1){
      ar[k] = ar1[i];
      i++;
      k++;
    }
    while(j<n2){
      ar[k] = ar2[j];
      j++;
      k++;
    }
  }
  //------------------------------------------------
  //count sort 
  // time complexity - O(N+M)
    public int[] countSort(int[] inputArray) {
        int N = inputArray.length;
        int M = 0;
 
        for (int i = 0; i < N; i++) {
            M = Math.max(M, inputArray[i]);
        }
 
        int[] countArray = new int[M + 1];
 
        for (int i = 0; i < N; i++) {
            countArray[inputArray[i]]++;
        }
 
        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }
 
        int[] outputArray = new int[N];
 
        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
            countArray[inputArray[i]]--;
        }
 
        return outputArray;
    }
  //------------------------------------------------
  
  public static void main(String[] args) {
    int arr[] = {99,40,50,70,29};
    // int arr[] = {5,5,5,5};
    Sorting s = new Sorting();
    // s.selectionsort(arr);
    // s.bubblesort(arr);
    // s.intersectionsort(arr);
    // s.divideMergesort(arr, 0, arr.length-1);
    s.quicksort(arr, 0, arr.length-1);

  /*int outputArray[] = s.countSort(arr);
  for(int i = 0 ; i<arr.length;i++)
    System.out.print(outputArray[i]+" ");*/

    for(int i = 0 ; i<arr.length;i++)
    System.out.print(arr[i]+" ");
  }
}


