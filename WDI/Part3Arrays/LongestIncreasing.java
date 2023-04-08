package org.WDI.Part3Arrays;

public class LongestIncreasing {
    public static int longest( int[] arr){
        if(arr.length == 0){
            return 0;
        }
        int longest = 1;
        int current_longest = 1;
        for( int i = 1; i < arr.length; i++){
            if( arr[i] - arr[i-1] > 0){
                current_longest += 1;
                longest = Math.max(longest, current_longest);
            }
            else{
                current_longest = 1;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longest(new int[]{1 ,2 ,3, 4, 0, 1, 2}));
        System.out.println(longest(new int[]{}));
    }
}
