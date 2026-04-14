import java.util.*;
import javax.swing.*;

public class Week12 {
    public static void main(String[] args) {
        //previous Circle example with resizeable array
        //make 10 circles

        ArrayList<Circle> r = new ArrayList<Circle>();
        for (int i = 1; i <= 10; i++) {
            Circle c = new Circle(i);
            r.add(c);
        }

        for (int i = 0; i < r.size(); i++) {
            Circle c = r.get(i);
            if (c.area() >= 5 && c.area() <= 10) {
                System.out.println(c);
            }
        }

        //change to use ArrayList
        //enhanced for loop


       //can we create an object of an interface type?
       Nameable n = new Circle(4);
       System.out.println(n.getName());

       //how can we use the interface type?

        //using message dialog, input dialog

        JOptionPane.showMessageDialog(null, "Hello, world!");

        String input = JOptionPane.showInputDialog("Enter your name: ");

        JOptionPane.showMessageDialog(null, "Hello, " + input);
    }
}