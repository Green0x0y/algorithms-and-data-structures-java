package org.Tasks.Java.FilesReader;
//Napisz program w Javie, który odczyta plik tekstowy i
// policzy liczbę wystąpień każdego słowa w tym pliku. Wyniki
// należy wyświetlić na ekranie w kolejności alfabetycznej.
// Można założyć, że słowa w pliku są oddzielone spacjami.
//
//        Wskazówki:
//
//        Aby odczytać plik tekstowy w Javie,
//        można użyć klasy FileReader i BufferedReader.
//        Słowa można przechowywać w mapie,
//        gdzie kluczem będzie słowo, a wartością ilość wystąpień.
//        Do sortowania mapy można użyć strumieni
//        (stream) i metody sorted() w połączeniu z Collectors.toList().
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FilesReader {

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\laura\\OneDrive\\Pulpit\\Studia\\JavaInternshipPrepare\\JavaAlgorithms\\Arrays\\Algorithms\\src\\main\\java\\org\\Tasks\\Java\\FilesReader\\example.txt";
        Map<String, Integer> wordCounts = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String, Integer> sortedWordCounts = new TreeMap<>(wordCounts);

        for (Map.Entry<String, Integer> entry : sortedWordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
