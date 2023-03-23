package org.Tasks.TopThree;
//Napisz funkcję, która przyjmuje tablicę liczb całkowitych
//        i zwraca sumę trzech największych liczb z tej tablicy.
import java.util.Arrays;

public class ThreeLargest {
    public static int sumOfThreeLargest(int[] arr){
        int[] topThree = {0,0,0};
        for (int j : arr) {
            if (j > topThree[2]) {
                topThree[0] = topThree[1];
                topThree[1] = topThree[2];
                topThree[2] = j;

            } else if (j > topThree[1]) {
                topThree[0] = topThree[1];
                topThree[1] = j;
            } else if (j > topThree[0]) {
                topThree[0] = j;
            }
            System.out.println(Arrays.toString(topThree));
        }
        return topThree[0] + topThree[1] + topThree[2];
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 9, 12};
        int result = sumOfThreeLargest(arr);
        System.out.println(result);
    }
}
