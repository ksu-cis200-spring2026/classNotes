import java.util.*;

public class Jan26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Example: burgers are $6.79 each. 
        //Get number of burgers, 
        //print total

        /*
        System.out.print("Enter number of burgers: ");
        int burgers = s.nextInt();

        double total = burgers*6.79;

        //Total is: $19.87
        System.out.printf("Total is: $%.2f%n", total);
        */

        //pizzas have 8 slices
        //get number of pizzas
        //get number of people

        //slices each, leftover
        System.out.print("Enter number of pizzas: ");
        int pizzas = s.nextInt();

        System.out.print("Enter number of people: ");
        int people = s.nextInt();

        int slicesEach = pizzas*8 / people;
        int leftover = pizzas*8 % people;

        System.out.printf("Everyone gets %d slices with %d leftover%n", slicesEach, leftover);
    }
}