package org.Tasks.Bot.StringSort;
//Napisz metodę sortowania przez wstawianie (insertion sort) dla tablicy napisów,
// ale tak aby sortowanie odbywało się alfabetycznie od tyłu (tzn. od końca do początku).
// Twoje zadanie polega na napisaniu metody sortInsertionReverse(String[] arr),
//   która przyjmuje tablicę napisów i sortuje ją w miejscu,
//   tj. bez tworzenia nowej tablicy.
//     Metoda powinna zwracać posortowaną tablicę.

import java.util.Arrays;

//String[] arr = {"bb", "abc", "ac", "cba", "ba", "a"};
//        sortInsertionReverse(arr);
//        System.out.println(Arrays.toString(arr));
// Wynik: [cba, ba, bb, ac, abc, a]
public class StringSort {
    static String[] arr = {"bb", "abc", "ac", "cba", "ba", "a"};
    //insertion -wstawiamy do posortowanej kolejne elementy O(n^2)
    static int n = arr.length;
    public static void sortInsertionReverse(String[] arr) {
        for (int i = arr.length - 2; i >= 0; i--) {
            String key = arr[i];
            int j = i + 1;
            while (j < arr.length && key.compareTo(arr[j]) < 0) {
                arr[j - 1] = arr[j];
                j++;
            }
            arr[j - 1] = key;
        }
    }


    public static void main(String[] args) {
        sortInsertionReverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
