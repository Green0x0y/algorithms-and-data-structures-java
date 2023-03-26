package org.Alorithms;

public class BinSearch {
    public static int binarySearch(int[] arr, int left, int right, int num ){

        while( left <= right){
            int mid = (left + right)/2;
            if (arr[mid] == num){
                return mid;
            }
            else if( arr[mid] > num){
                return binarySearch(arr, left, mid - 1, num);
            }
            else
                return binarySearch(arr, mid + 1,right, num);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,5,7,8,9,7},  0, 5, 8));
    }
}
