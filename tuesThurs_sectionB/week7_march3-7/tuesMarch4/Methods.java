import java.util.*;

public class Methods {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = {-3,5,-2,7,17,5};

        //update each array element to be its own absolute value
        for (int i = 0; i < arr.length; i++) {
            arr[i] = absVal(arr[i]);
        }


        System.out.print("Enter a word: ");
        String word = s.nextLine();

        //print something like: madam is a palindrome
        //or loop is not a palindrome


        
        int[] another = {1,4,17,25,36,37,45};
        System.out.print("Enter a number to search for: ");
        int num = s.nextInt();

        //print something like: 17 is at index 2
        //or 5 is not found

    }

    //write a method to compute the absolute value (int)
    public static int absVal(int val) {
        //-4 should be 4
        //4 should be 4

        if (val < 0) {
            return val*-1;
        }
        else {
            return val;
        }
    }

    //write a method to return whether a String 
    //is a palindrome
    //spelled same forwards and backwards racecar
    public static boolean palindrome(String word) {
        //create StringBuilder
        //loop through word backwards
            //append each letter on the StringBuilder
        //see if StringBuilder equals word

        int front = 0;
        int back = word.length()-1;

        while (front < back) {
            if (word.charAt(front) != word.charAt(back)) {
                return false;
            }

            front++;
            back--;
        }

        return true;
    }


    //write a method to return position of 
    //an element in an array (of integers)
    //{3,2,4}, looking for 4, return 2
    public static int indexOf(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                return i;
            }
        }
        return -1;
    }
}