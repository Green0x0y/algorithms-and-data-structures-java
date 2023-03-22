package org.alorithms;

public class SortAlgsNLogN {

     static  int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low -1;
        for(int j = low; j < high; j++){
            if(arr[j]<= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]= arr[high];
        arr[high] = temp;
        return i + 1;
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int p = partition(arr, low, high);
            quickSort(arr,low, p-1);
            quickSort(arr,p+1,high);
        }

    }
    public static void merge(int[] arr, int left, int mid, int right){
         int n1 = mid - left + 1;
         int n2 = right - mid;
         int L[] = new int[n1];
         int R[] = new int[n2];

         for(int i = 0 ; i <n1; i++ ){
             L[i] = arr[left+i];

         }
         for(int i = 0 ; i < n2; i++){
             R[i] = arr[mid+ 1+i];
         }

         int i = 0 , j = 0;
         int k = left;
         while(i < n1 && j <n2){
             if(L[i] <= R[j]){
                 arr[k] = L[i];
                 i++;
             }
             else{
                 arr[k] = R[j];
                 j++;
             }
             k++;

         }
         while(i < n1){
             arr[k] = L[i];
             i++;
             k++;
         }
         while(j < n2){
             arr[k] = R[j];
             j++;
             k++;
         }


    }
    public static void mergeSort(int[] arr, int left,int right){
         if (left < right) {

             int mid = (left + right) / 2;
             mergeSort(arr, left, mid);
             mergeSort(arr, mid + 1, right);
             merge(arr, left,mid, right);
         }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {4,4,2,6,8};
        quickSort(arr, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int[] arr2 = {4,1,2,6,8};
        mergeSort(arr2, 0,n -1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
