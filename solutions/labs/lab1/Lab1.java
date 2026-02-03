import java.util.*;

public class Lab1 { 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of donut boxes: ");
        int boxes = s.nextInt();
        int donuts = boxes*12;

        System.out.printf("There are %d total donuts in %d boxes%n", donuts, boxes);
    }
}