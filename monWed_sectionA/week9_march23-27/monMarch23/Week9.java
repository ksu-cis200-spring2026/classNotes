import java.util.*;

public class Week9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //radius 3.5 circle
        //create a new 3.5 circle (creating an object)
        Circle c1 = new Circle(3.5);

        //print its area
        System.out.printf("Area: %.2f%n", c1.area());

        //radius 4 circle
        //print its area
        Circle c2 = new Circle(4);
        System.out.printf("Area: %.2f%n", c2.area());

        //update references
        c1 = c2;

        //fraction 1/2
        Fraction f1 = new Fraction(1, 2);

        //fraction 2/3
        Fraction f2 = new Fraction(2, 3);

        Fraction result = f1.plus(f2);
    }
}