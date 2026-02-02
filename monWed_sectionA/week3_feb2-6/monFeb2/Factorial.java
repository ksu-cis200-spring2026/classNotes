import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a postive number: ");
        int num = s.nextInt();

        if (num >= 1) {
            System.out.printf("%d! = ", num);

            //will loop num times
            int product = 1;
            for (int i = num; i >= 1; i--) {
                product *= i;
                System.out.printf("%d", i);
                if (i > 1) System.out.print("*");
            }
            System.out.printf(" = %d%n", product);
        }
        else {
            System.out.println("Error: input must be positive");
        }
        

        //print the factorial of num, like:
        //5! = 5*4*3*2*1 = 120
        //how to add input validation?
    }
}