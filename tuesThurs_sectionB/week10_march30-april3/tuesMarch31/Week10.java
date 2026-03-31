import java.util.*;

public class Week10 {
    public static void main(String[] args) {
        //create ConsoleOps object
        ConsoleOps c = new ConsoleOps();

        //get 5 numbers from user, print sum
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            try {
                int num = c.getInteger();
                sum += num;
            }
            catch (NumberFormatException ex) {
                c.printError();
            }
        }

        c.printInteger(sum, "Sum is");
        

        //what could crash?

        //how to handle?
    }
}