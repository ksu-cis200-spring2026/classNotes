import java.util.*;
import javax.swing.*;

public class Week12 {
    public static void main(String[] args) {
        //previous Circle example with resizeable array

        //ResizeableArray r = new ResizeableArray();
        ArrayList<Circle> list = new ArrayList<Circle>();
        for (int i = 1; i <= 10; i++) {
            Circle c = new Circle(i);
            list.add(c);
        }

        
        for (int i = 0; i < list.size(); i++) {
            Circle c = list.get(i);
            if (c.area() >= 5 && c.area() <= 10) {
                System.out.println(c);
            }
        }

        //change to use ArrayList
        //enhanced for loop


       //can we create an object of an interface type?

       Nameable n = new Circle(5);
       System.out.println(n.getName());

       //how can we use the interface type?

        //using message dialog, input dialog
        JOptionPane.showMessageDialog(null, "Hello, world!");
    
        String input = JOptionPane.showInputDialog("Enter name: ");

        //display hello and their name
        JOptionPane.showMessageDialog(null, "Hello, " + input);
    }
}