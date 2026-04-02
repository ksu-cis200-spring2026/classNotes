import java.util.*;

public class Week10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ResizeableArray arr = new ResizeableArray();

        int radius;
        do {
            System.out.print("Enter radius: ");
            radius = s.nextInt();
            Circle c = new Circle(radius);
            arr.add(c);
        } while (radius != 0);

        for (int i = 0; i < arr.size(); i++) {
            Circle c = (Circle)arr.get(i);

            if (c.area() >= 10 && c.area() <= 50) {
                System.out.println(c);
            }
        }


        /*
            Make ResizeableArray of Circles
            User enters info for as many as they want
            They enter radius of 0 to quit

            Afterward, print the ones that have an area between 5-10
        */
    }
}