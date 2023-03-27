package org.Tasks.Dynamic.MaxSum;
//Dana jest tablica n liczb całkowitych. Napisz funkcję, która zwróci wartość największej sumy podciągu (ang. subarray) tej tablicy.
//
// Na przykład, dla tablicy [1, -2, 3, 10, -4, 7, 2, -5], największą sumą podciągu jest 18,
// a podciągem o takiej sumie jest [3, 10, -4, 7, 2]. Funkcja powinna zwrócić wartość 18.
//
// Pamiętaj, aby uwzględnić przypadek, gdy wszystkie elementy tablicy są ujemne.
public class MaxSum {
    public static int maxSubarraySum(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, 10, -4, 7, 2, -5};
        System.out.println(maxSubarraySum(nums)); // Output: 18
    }

}
