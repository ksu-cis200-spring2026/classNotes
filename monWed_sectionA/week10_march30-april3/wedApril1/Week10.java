import java.util.*;

public class Week10 {
    public static void main(String[] args) {
        ResizeableArray r = new ResizeableArray();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int rad = rand.nextInt(9)+2;
            Circle c = new Circle(rad);
            r.add(c);
        }
        //make 10 circles, with random radius
        //from 2-10

        for (int i = 0; i < r.size(); i++) {
            Circle c = (Circle) r.get(i);
            if (c.area() >= 5 && c.area() <= 10) {
                System.out.println(c);
            }
        }

        /*
            Make ResizeableArray of Circles

            Afterward, print the ones that have an area between 5-10
        */
    }
}