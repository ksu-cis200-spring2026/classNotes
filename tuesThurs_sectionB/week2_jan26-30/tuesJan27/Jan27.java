import java.util.*;

public class Jan27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //how many burgers
        //$6.79 each
        //print the total cost

        /*
        System.out.print("Enter number of burgers: ");
        int burgers = s.nextInt();

        double total = 6.79*burgers;

        //Your total is: $21.89
        System.out.printf("Your total is: $%.2f%n", total);
        */

       //8 slices per pizza
       //get #pizzas, #people

        System.out.print("Enter number of pizzas: ");
        int pizzas = s.nextInt();
        System.out.print("Enter number of people: ");
        int people = s.nextInt();

        int slices = pizzas*8 / people;
        int leftover = pizzas*8 % people;

        System.out.printf("Everyone gets %d slices with %d leftover%n", slices, leftover);
    }
}