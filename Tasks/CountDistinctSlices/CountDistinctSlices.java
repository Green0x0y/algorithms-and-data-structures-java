package org.Tasks.CountDistinctSlices;
//Mamy dany ciąg liczb całkowitych A o długości N. Liczby w ciągu są nie większe niż M. Należy znaleźć liczbę różnych podciągów ciągu A.
//Na przykład, dla A = [3,4,5,5,2] i M = 6, funkcja powinna zwrócić 9, ponieważ istnieją 9 różnych podciągów:
//[3], [4], [5], [3,4], [4,5], [3,4,5], [5,5], [4,5,5], [3,4,5,5].
public class CountDistinctSlices {
    public static int solution(int M, int[] A){
        int n = A.length;
        boolean[] seen = new boolean[M+1];
        int left = 0;
        int right = 0;
        int count =0;
        while(right < n) {
            while (left <= right && seen[A[right]]){
                seen[A[left]] = false;
                left++;
            }
            seen[A[right]] = true;
            count += (right - left + 1);
            right++;

        }

            return count;

    }

    public static void main(String[] args) {
        int[] A = {3,4,5,5,2};
        int M = 6;
        System.out.println(solution(M, A));

    }
}
