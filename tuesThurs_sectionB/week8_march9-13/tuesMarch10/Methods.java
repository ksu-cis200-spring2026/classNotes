import java.util.*;

public class Methods {
    public static void main(String[] args) {
        if (args.length == 2) {
            char letter = args[0].charAt(0);
            int num = Integer.parseInt(args[1]);
            num++;
            System.out.println(letter + " " + num);
        }
        else {
            System.out.println("Run as: java Methods word number");
        }

        //command-line args: word number
        //java Methods apple 15

        //print 1st letter of word
        //print one more than number

        //print error if one or both not provided
    }
};