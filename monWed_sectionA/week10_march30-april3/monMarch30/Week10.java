import java.util.*;

public class Week10 {
    public static void main(String[] args) {
        //create a ConsoleOps object
        ConsoleOps c = new ConsoleOps();

        //get 5 numbers from user, print sum
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int num = 0;

            //calling this method led to an exception
            try {
                num = c.getInteger();
            }
            catch (NumberFormatException ex) {
                c.printError();
                i--;
            }

            sum += num;
        }

        c.printInteger(sum, "The sum is");

        //what could crash?

        //how to handle?
    }
}