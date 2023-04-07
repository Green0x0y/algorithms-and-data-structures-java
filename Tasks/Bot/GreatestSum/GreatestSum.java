package org.Tasks.Bot.GreatestSum;

import java.util.Arrays;
import java.util.Scanner;

public class GreatestSum {
    public static int sum(){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] nums = line.split(" ");
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (String num : nums) {
            curr_sum += Integer.parseInt(num);
            max_sum = Math.max(curr_sum, max_sum);
            curr_sum = Math.max(curr_sum, 0);
        }
        return max_sum;

    }

    public static void main(String[] args) {
        System.out.println(sum());
    }
}
