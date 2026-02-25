import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a list of numbers separated by commas: ");
        String line = s.nextLine();

        double sum = 0;
        int index = 0;
        boolean done = false;
        do {
            int comma = line.indexOf(",", index);

            String piece;
            if (comma == -1) {
                piece = line.substring(index);
                done = true;
            }
            else {
                piece = line.substring(index,comma);
            }

            index = comma+1;

            sum += Double.parseDouble(piece);
        } while (!done);

        System.out.println(sum);

        //like: 12,4,-3.2,5

        //how to print the sum of the numbers WITHOUT split?

    }
}