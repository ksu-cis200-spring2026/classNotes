import java.util.*;

public class Jan29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*
            bags of chips are buy one get one free
            full price is $5.99 each

            limit 10 bags. other invalid?
        */

        System.out.print("Enter number of bags: ");
        int bags = s.nextInt();

        if (bags > 0 && bags <= 10) {

            double price;
            //is it even

            //double price = ((bags+1)/2) * 5.99;

            if (bags % 2 == 0) {
                price = (bags/2) * 5.99;
            }
            else {
                price = (bags/2) * 5.99 + 5.99;
            }

            System.out.printf("Total $%.2f%n", price);
        }
        else if (bags <= 0) {
            System.out.println("Must purchase a positive number of bags");
        }
        else {
            System.out.println("Sale limited to 10 bags");
        }
    }
}