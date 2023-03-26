package org.Tasks.Java.StringBuilder;

public class ConcatenateWords {
    public static StringBuilder buildString(String[] words) {
        // Implementacja metody
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
        }
        return sb;
    }

    public static void main(String[] args) {
        String[] words = {"Ala", "ma", "kota"};
        StringBuilder result = buildString(words);
        System.out.println(result.toString()); // Output: Alamakota
    }
}