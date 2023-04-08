package org.WDI.Part4Arrays2;

import java.util.Arrays;

public class Spiral {
    public static int[][] spiral(int n) {
        int[][] arr = new int[n][n];
        int x = 0;
        int y = 0;
        int k = 1;
        int right = n - 1;
        int left = 0;
        int up = 0;
        int down = n - 1;
        while (k <= n * n) {
            // Wypełnij wiersz od lewej do prawej
            for (int i = left; i <= right; i++) {
                arr[up][i] = k;
                k++;
            }
            up++;
            // Wypełnij kolumnę od góry do dołu
            for (int i = up; i <= down; i++) {
                arr[i][right] = k;
                k++;
            }
            right--;
            // Wypełnij wiersz od prawej do lewej
            for (int i = right; i >= left; i--) {
                arr[down][i] = k;
                k++;
            }
            down--;
            // Wypełnij kolumnę od dołu do góry
            for (int i = down; i >= up; i--) {
                arr[i][left] = k;
                k++;
            }
            left++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        return arr;
    }

    public static void main(String[] args) {
        spiral(5);
    }
}