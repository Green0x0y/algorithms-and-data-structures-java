package org.WDI.Part6Recursion;
//Dany jest zestaw odważników T[N].
// Napisać funkcję, która sprawdza czy jest
// możliwe odważenie określonej masy.
// Odważniki można umieszczać tylko na jednej szalce.
public class Weight {
    public static boolean canBalance(int[] T, int n, int m){
        if(m==0){
            return true;
        }
        if(m < 0){
            return false;
        }
        for(int i = 0; i < n; i++){
            if(T[i] > 0){
                T[i] = - T[i];
                if(canBalance(T, n, m-T[i])){
                    return true;
                }
                T[i] = -T[i];
            }
        }
        return false;
    }
}
