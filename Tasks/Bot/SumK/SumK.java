package org.Tasks.Bot.SumK;
//Napisz funkcję, która przyjmuje jako argument
// tablicę liczb całkowitych oraz liczbę k.
// Funkcja ma zwrócić True jeśli w tablicy znajdują
// się dwa elementy, których suma jest równa k,
// lub False w przeciwnym przypadku.
public class SumK {
    public static boolean sumExists(int[] arr, int k){
        boolean[] canSum = new boolean[k];
        for (int j : arr) {
            if (j < k) {
                canSum[j - 1] = true;
                if (canSum[k - j - 1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int k = 7;

        System.out.println(sumExists(arr,k));
    }
}
