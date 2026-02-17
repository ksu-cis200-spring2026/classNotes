import java.util.*;

public class Feb17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter 6 numbers: ");
        int[] nums = new int[6];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        for (int i = nums.length-1; i >= 0; i--) {
            System.out.println(nums[i]);
        }

        /*
            Get 6 numbers from the user, all in a line.

            Print them in reverse.
        */
    }
}