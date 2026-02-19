import java.util.*;

public class Grid {
    public static void main(String[] args) {
        //7 is the rows, 3 is the columns

        double[][] grid = new double[7][3];

        //nested for loops
        //outer loop: rows
            //inner loop: cols

        for (int i = 0; i < grid.length; i++) {
            double cur = i+1;
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = cur;
                cur += 0.1;
            }
        }

        //System.out.println(grid); //prints memory address
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.printf("%d ", grid[i][j]);
            }
            System.out.println();
        }

        /*
            Create a 7x3 array of doubles.

            Initialize first row to be: 1.0, 1.1, 1.2
            Initialize the second row to be: 2.0, 2.1, 2.2
            ...etc.


            Then print array
        */
    }
}