import java.util.*;

public class Feb4 {
    public static void main(String[] args) {
        Scanner s = new Scanner();
        Random r = new Random();

        System.out.print("Enter a dice value (1-6): ");
        int val = s.nextInt();
        int dice;

        do {
            System.out.print("Press Enter to roll.");
            s.nextLine();
            dice = r.nextInt(6) + 1;
            System.out.printf("You rolled %d%n", dice);
        } while (dice != val);

        /*
            Example: user enters a dice value (1-6)
            repeatedly roll a die (user presses Enter to roll)
            until user rolls that value
        */
    }
}