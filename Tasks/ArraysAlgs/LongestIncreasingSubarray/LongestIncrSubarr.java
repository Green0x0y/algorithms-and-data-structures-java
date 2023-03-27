package org.Tasks.ArraysAlgs.LongestIncreasingSubarray;

import java.util.Arrays;

public class LongestIncrSubarr {
    // spójny
    public static int calculate(int[] arr){
        if(arr.length == 1) {
            return 1;
        }
        if(arr.length ==0){
            return 0;
        }
        int currentLongest =0;
        int maxVal =0;
        for( int i =1; i <  arr.length; i++){
            if(arr[i] > arr[i-1]){
                currentLongest++;
                maxVal = Math.max(currentLongest, maxVal);
            }
            else{
                currentLongest = 0;
            }
        }
        return maxVal + 1;
    }
    //niespójny
    public static int calculate2(int[ ] arr){
        if(arr.length == 1) {
            return 1;
        }
        if(arr.length ==0){
            return 0;
        }

        int maxVal =1;
        int[] maxEndedHere = new int[arr.length];
        Arrays.fill(maxEndedHere, 1);
        for(int i =0; i < arr.length; i++){
            for( int j =0; j < i ; j++){
                if(arr[j] < arr[i]){
                    maxEndedHere[i] = Math.max(maxEndedHere[i], maxEndedHere[j] + 1);

                }
                maxVal = Math.max(maxVal, maxEndedHere[i]);
            }
        }

        return maxVal;
    }

    public static void main(String[] args) {
        int[] arr =  {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        System.out.println(calculate2(arr));
    }
}
