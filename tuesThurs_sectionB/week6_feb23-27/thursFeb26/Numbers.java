import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a list of numbers separated by commas: ");
        String line = s.nextLine();

        //like: 12,4,-3.2,5

        double sum = 0;
        int index = 0;
        boolean done = false;
        do {
            int comma = line.indexOf(",", index);

            String piece;
            //grabbing last number
            if (comma == -1) {
                piece = line.substring(index);
                done = true;
            } 
            else {
                piece = line.substring(index,comma);
            }

           sum += Double.parseDouble(piece); 
           index = comma+1;
        } while (!done);

        //how to print the sum of the numbers WITHOUT split?
        System.out.println(sum);
    }
}