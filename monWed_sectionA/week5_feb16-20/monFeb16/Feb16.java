import java.util.*;

public class Feb16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vals = new int[6];
        System.out.print("Enter 6 numbers: ");
        for (int i = 0; i < vals.length; i++) {
            vals[i] = s.nextInt();
        }

        System.out.println("Reversed:");
        for (int i = vals.length-1; i >= 0; i--) {
            System.out.println(vals[i]);
        }

        /*
            Get 6 numbers from the user, all in a line

            Print them in reverse
        */
    }
}