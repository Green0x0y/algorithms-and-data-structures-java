package org.Tasks.Bot.Sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//tylko słowa z unikalnymi znakami
public class SetJava {
    public static void count(){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        Set<Character> letters = new HashSet<>();

        for(String word: words){
            boolean isUnique = true;
            letters.clear();
            for(int i =0; i < word.length(); i++){
                if(!letters.add(word.charAt(i))){
                    isUnique = false;
                    break;
                }
            }
            if (isUnique){
                System.out.println(word);
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        count();
    }

}
