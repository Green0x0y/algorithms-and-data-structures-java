package org.Tasks.ArraysAlgs.LongestString;

import java.util.HashSet;
import java.util.Set;

//Napisz funkcję, która jako argument przyjmuje napis
//   i zwraca najdłuższy
//        podciąg złożony z unikalnych znaków.
//
//        Przykładowo, dla napisu "abcabcbb" wynikiem
//        powinno być "abc", dla napisu "bbbbb" wynikiem powinno być "b", a dla napisu "pwwkew" wynikiem powinno być "wke".
//
//        Możesz założyć, że napis składa się wyłącznie
//        z małych liter alfabetu angielskiego (a-z).
public class LongestString {
    public static String longest(String text){
        Set<String> set = new HashSet<>();
        for(int i = 0; i < text.length(); i++){
            set.add(String.valueOf(text.charAt(i)));

        }
        return String.join("", set);
    }

    public static void main(String[] args) {
        String a = "abcabcbb";
        System.out.println(longest(a));
    }
}
