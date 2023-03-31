package org.Tasks.Java.Exceptions.Sqrt;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();

        try{
            if(num < 0){
                throw new IllegalArgumentException("Argument cannot be negative");
            }
            double res = Math.sqrt(num);
            System.out.println(res);
        } catch( IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
