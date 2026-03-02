import java.util.*;

public class Methods {
    public static int example;

    public static void main(String[] args) {
        //initialize global variables
        example = 3;

        Scanner s = new Scanner(System.in);

        int[] arr = {-3,5,-2,7,17,5};

        //update each array element to be its own absolute value




        System.out.print("Enter a word: ");
        String word = s.nextLine();

        //print something like: madam is a palindrome
        //or loop is not a palindrome

        


        int[] another = {1,4,17,25,36,37,45};
        System.out.print("Enter a number to search for: ");
        int num = s.nextInt();

        //print something like: 17 is at index 2
        //or 5 is not found

        int result = findPos(another, num)
        if (result != -1) {
            System.out.printf("%d is at index %d%n", num, result);
        }
        else {
            System.out.printf("%d not found%n", num);
        }
    }

    //write a method to compute the absolute value (of an int)
    public static int absVal(int val) {
        //-4 should be 4
        //4 should be 4

        if (val < 0) {
            return -1*val;
        }
        else {
            return val;
        }
    }

    //write a method to return whether a String 
    //is a palindrome
    //racecar is a palindrome
    public static boolean palindrome(String name) {
        int front = 0;
        int back = name.length()-1;

        while (front < back) {
            if (name.charAt(front) != name.charAt(back)) {
                return false;
            }
            else {
                front++;
                back--;
            }
        }

        return true;
    }

    //write a method to return position of 
    //an element in an array (of integers)
    //{2,3,4} looking for 2, return 0
    public static int findPos(int[] arr, int elem) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                return i;
            }
        }

        return -1;
    }
}