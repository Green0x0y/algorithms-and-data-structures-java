package org.Tasks.Java.Streams;
//Podaj liczbę liczb całkowitych: 5
// Podaj 5 liczb całkowitych: 5 15 2 9 25
// Najmniejsza liczba to: 2
// Średnia arytmetyczna: 11.2
// Liczby większe niż 10 i podzielne przez 3: [15]
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx{
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "example", "stream", "java");

        List<Integer> lengths = words.stream()
                .map(String::length).toList();
        System.out.println(lengths);

        List<Integer> oddLengths = words.stream()
                .map(String::length)
                .filter(length -> length % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(oddLengths);

        String concatenatedWords = String.join(", ", words);
        System.out.println(concatenatedWords);
    }
}

