import java.util.*;

public class Jan28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*
            bags of chips are buy one get one free
            full price is $5.99 each.

            limit 10 bags total

            other invalid input?
        */

        System.out.print("Enter number of bags: ");
        int bags = s.nextInt();

        if (bags < 11 && bags > 0) {

            double price = (bags/2) * 5.99 + (bags%2)*5.99;

            System.out.printf("Total: $%.2f%n", price);
        }
        else if (bags <= 0) {
            System.out.println("Need to buy a positive number of bags");
        }
        else {
            System.out.println("Sale limited to 10 bags");
        }
    }
}