import java.util.*;

public class Feb5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        //values of correct? What if we wanted 1-100?
        int correct = r.nextInt(100)+1;

        int guess;
        do {
            System.out.print("Enter a gues: ");
            guess = s.nextInt();

            if (guess > correct) {
                System.out.println("Too high");
            }
            else if (guess < correct) {
                System.out.println("Too low");
            }
        } while (guess != correct);

        System.out.println("You guessed it!");

        /*
            Example: have user guess a random number
            print high, low, you got it
        */
    }
}