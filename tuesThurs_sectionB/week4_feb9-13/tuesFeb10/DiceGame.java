import java.util.*;

public class DiceGame {
    public static void main(String[] args) {
        //below is a modification of lab 5
        //make it repeatable
        //keep a max score

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int total = 0;
        char again;
        do {
            //roll a dice
            int roll = r.nextInt(6) + 1;
            System.out.printf("You rolled %d%n", roll);

            //did they roll a 1?
            if (roll == 1) {
                total = 0;
                break;
            }
            else {
                total = total + roll;
            }
            
            System.out.printf("%nCurrent total: %d points%n", total);

            //add it to total, update stuff
            //do they want to go again?
            System.out.print("Do you want to roll again? (y/n) ");
            again = (s.nextLine().toLowerCase()).charAt(0);

        } while (again == 'y');

        //print end of game stuff
        if (total >= 20) {
            System.out.printf("Total: %d points. You win!%n", total);
        }
        else {
            System.out.printf("Total: %d points. You lose.%n", total);
        }
    }
}