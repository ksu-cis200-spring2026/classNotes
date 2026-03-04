import java.util.*;
public class Hangman {
    public static Scanner s;

    //build initial character array
    public static char[] buildInitial(int len) {
        char[] guessed = new char[len];
        for (int i = 0; i < guessed.length; i++) {
            guessed[i] = '_';
        }

        return guessed;
    }

    public static void printPuzzle(char[] array) {
        System.out.print("\nCurrent puzzle: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%c ", array[i]);
        }
    }

    public static boolean getGuess(char[] puzzle, String correct) {
        System.out.print("Enter a letter: ");
        char guess = s.nextLine().toLowerCase().charAt(0);

        boolean correctGuess = false;
        for (int i = 0; i < correct.length(); i++) {
            if (correct.charAt(i) == guess && puzzle[i] == '_') {
                puzzle[i] = guess;
                correctGuess = true;
            }
        }

        return correctGuess;
    }

    public static boolean solved(char[] puzzle) {
        for (int i = 0; i < puzzle.length; i++) {
            if (puzzle[i] == '_') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        s = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = s.nextLine();

        char[] guessed = buildInitial(word.length());

        int max = 6;
        boolean wordGuessed = false;
        while (max > 0 && !wordGuessed) {
            printPuzzle(guessed);

            System.out.println("\nAttempts left: " + max);
            boolean correctGuess = getGuess(guessed, word);

            if (!correctGuess) {
                System.out.println("Wrong guess!");
                max--;
            } else {
                System.out.println("Correct guess!");
            }

            wordGuessed = solved(guessed);
        }

        if (wordGuessed) {
            System.out.println("\nCongratulations! You guessed the word: " + word);
        } else {
            System.out.println("\nGame Over! The word was: " + word);
        }
    }
}