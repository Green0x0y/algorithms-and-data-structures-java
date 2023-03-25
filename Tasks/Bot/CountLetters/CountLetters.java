package org.Tasks.Bot.CountLetters;

import java.util.Scanner;

public class CountLetters {

    public static void count(){
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        sentence = sentence.toUpperCase();
        int arr[] = new int[26];
        for(int i = 0; i < sentence.length(); i++){
            if(((int)sentence.charAt(i))%65 <26){

                arr[((int)sentence.charAt(i))%65] += 1;
            }

        }
        for(int i = 0; i < arr.length; i++){
            System.out.println((char)(i+65) + ": " + arr[i]);

        }
    }

    public static void main(String[] args) {
        count();
    }
}
