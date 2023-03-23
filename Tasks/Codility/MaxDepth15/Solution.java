package org.Tasks.Codility.MaxDepth15;


public class Solution {
    public static int solution(int[] A){
        if (A.length < 3) return 0;
        int left = 0;
        int right = A.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int depth = 0;
        while (left < right) {
            if (A[left] < A[right]) {
                if (A[left] >= leftMax) {
                    leftMax = A[left];
                } else {
                    depth = Math.max(depth, leftMax - A[left]);
                }
                left++;
            } else {
                if (A[right] >= rightMax) {
                    rightMax = A[right];
                } else {
                    depth = Math.max(depth, rightMax - A[right]);
                }
                right--;
            }
        }
        return depth;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,7,5,6}));
    }
}
