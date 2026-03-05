import java.util.*;
public class Hangman {
    //s is visible to all the methods
    public static Scanner s;

    public static char[] initialPuzzle(int len) {
        char[] puzzle = new char[len];
        for (int i = 0; i < puzzle.length; i++) {
            puzzle[i] = '_';
        }

        return puzzle;
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
        for (int i = 0; i < guessed.length; i++) {
            if (guessed[i] == '_') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        s = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = s.nextLine();

        //building the initial _ _ 
        char[] guessed = initialPuzzle(word.length());

        int max = 6;
        boolean wordGuessed = false;
        while (max > 0 && !wordGuessed) {
            //print the puzzle
            printPuzzle(guessed);

            System.out.println("\nAttempts left: " + max);

            //get a guess, plug it in
            boolean correctGuess = getGuess(guessed, word);

            if (!correctGuess) {
                System.out.println("Wrong guess!");
                max--;
            } else {
                System.out.println("Correct guess!");
            }

            //see if solved
            wordGuessed = solved(guessed);
        }

        if (wordGuessed) {
            System.out.println("\nCongratulations! You guessed the word: " + word);
        } else {
            System.out.println("\nGame Over! The word was: " + word);
        }
    }
}