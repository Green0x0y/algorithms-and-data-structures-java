package org.WDI.Part4Arrays2;

import java.util.Arrays;

//Dana jest tablica T[N][N] wypełniona liczbami
// naturalnymi.Proszę napisać funkcję która
//zwraca wiersz i kolumnę dowolnego elementu,
// dla którego suma otaczających go elementów jest największa.
public class GreatestSumAround {
    public static int[] maxAround(int[][] arr){
        int sum = 0;
        int max_sum =0;
        int x = -1;
        int y = -1;
        for( int i = 1; i < arr.length -1; i++){
            for(int j = 1; j< arr.length -1; j++){
                sum += arr[i+1][j] + arr[i+1][j -1] + arr[i+1][j+1]
                        + arr[i][j +1] + arr[i][j-1]
                        + arr[i-1][j] + arr[i-1][j -1] + arr[i-1][j+1];

                if(max_sum < sum){
                    x = i;
                    y = j;
                    max_sum = sum;
                }
                sum = 0;
            }

        }
        int[] array = new int[]{x,y};
        return array;
    }

    public static void main(String[] args) {
        int[][] arr = Spiral.spiral(5);
        System.out.println(Arrays.toString(maxAround(arr)));
    }
}
