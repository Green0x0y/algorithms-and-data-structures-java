package org.Tasks.Bot.GameW;

import java.util.Scanner;

public class HangmanGame {
    int chances = 7;
    String gameWord;
    String knownWord;

    void startGame(String word) {
        gameWord = word;
        knownWord = "_".repeat(word.length());
    }

    boolean makeGuess(char letter) {

        if (gameWord.contains(String.valueOf(letter))) {
            StringBuilder result = new StringBuilder(knownWord);

            for (int i = 0; i < gameWord.length(); i++) {
                if (gameWord.charAt(i) == letter) {
                    result.setCharAt(i, letter);
                }
            }
            knownWord = result.toString();
            return true;
        } else {
            chances -= 1;
            return false;
        }
    }

    boolean isGameWon() {
        return knownWord.equals(gameWord);
    }

    boolean isGameOver() {
        return chances == 0;
    }

    int getAttemptsLeft() {
        return chances;
    }

    String getMaskedWord() {
        return knownWord;
    }

    public static void main(String[] args) {
        HangmanGame game = new HangmanGame();
        game.startGame("patrz");

        while (!game.isGameOver()) {
            System.out.println("Słowo: " + game.getMaskedWord());
            System.out.println("Pozostałe próby: " + game.getAttemptsLeft());
            Scanner scanner = new Scanner(System.in);
            char letter = scanner.next().charAt(0);// odczytaj literę od gracza

            if (game.makeGuess(letter)) {
                System.out.println("Zgadłeś!");
                if (game.isGameWon()) {
                    System.out.println("Wygrałeś!");
                    break;
                }
            } else {
                System.out.println("Nie zgadłeś.");
            }
        }

        if (game.isGameOver() && !game.isGameWon()) {
            System.out.println("Przegrałeś");
        }
    }
}
