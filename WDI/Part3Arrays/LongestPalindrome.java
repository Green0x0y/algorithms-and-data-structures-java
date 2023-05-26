package org.WDI.Part3Arrays;

import static java.lang.Math.max;

//Dana jest N-elementowa tablica t jest wypełniona
// liczbami naturalnymi. Proszę napisać
//funkcję, która zwraca długość najdłuższego spójnego podciągu
// będącego palindromem złożonym wyłącznie
//z liczb nieparzystych. Do funkcji należy przekazać tablicę,
// funkcja powinna zwrócić długość znalezionego
//podciągu lub wartość 0 jeżeli taki podciąg nie istnieje

public class LongestPalindrome {
    // nieparzyste, palindrom, spójny np 1 3 3 1 
    public static int longest(int[] arr, int n){
        // 1 2 1 3 3 1 4 4 32 1
        
        int maxLen = 0;
        for( int i = 0; i < n ; i ++){
            // nieparzyste
            int left = i -1;
            int right = i+1;
            while( left >= 0 && right < n && arr[left] == arr[right]){
                int currentLength = right - left + 1;
                maxLen = max(maxLen, currentLength);
                left--;
                right++;
            }
            left = i;
            right = i + 1;
            while(left >= 0 && right < n && arr[left] == arr[right]){
                int currentLength = right -left + 1;
                maxLen = max(currentLength,maxLen);
                left--;
                right++;
            }
        }
        return maxLen;

    }
}
