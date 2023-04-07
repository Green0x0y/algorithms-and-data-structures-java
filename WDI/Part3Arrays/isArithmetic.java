package org.WDI.Part3Arrays;
//Napisać funkcję, która dla N-elementowej
// tablicy t wypełnionej liczbami naturalnym
// wyznacza długość najdłuższego,
// spójnego podciągu arytmetycznego.
public class isArithmetic {
    public static int longest(int[] arr){
        // 1 3 5 6 7
        // x = a + b /2
        // lub an = an-1 + r
        if(arr.length <= 2 ){
            return arr.length;
        }
        int prev_r = arr[1] - arr[0];
        int r;
        int leng = 2;
        int curr = 2;
        for( int i = 2 ; i < arr.length; i++){
            r = arr[i] - arr[i -1];
            if( r == prev_r){
                curr+= 1;
                leng = Math.max(curr, leng);

            }
            else{
                curr = 2;
            }
            prev_r = r;
        }
        return leng;
    }

    public static void main(String[] args) {
        System.out.println(longest(new int[] {1, 3, 4, 5, 7, 4, 5, 6, 5}));
    }
}
