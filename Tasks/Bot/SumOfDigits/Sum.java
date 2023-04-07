package org.Tasks.Bot.SumOfDigits;

import java.util.Scanner;

public class Sum {
    public static int sum(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        do {
            sum += num % 10;
            num/=10;
        }while (num/10 != 0);
        sum += num;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum());
    }
}
