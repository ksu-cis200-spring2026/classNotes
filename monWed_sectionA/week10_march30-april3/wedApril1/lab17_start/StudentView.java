import java.util.*;

public class StudentView {
    private Scanner s;

    public StudentView() {
        s = new Scanner(System.in);
    }

    //YOU DO THIS
    //Add the method printHonorRoll that takes a ResizeableArray of honor roll students and prints the information
        //for those students
    
    public void printHonorRoll(ResizeableArray honors) {
        System.out.println("Honor roll: ");
        for (int i = 0; i < honors.size(); i++) {
            System.out.println(honors.get(i));
        }
    }

    //Add the method printWithMajor that takes a ResizeableArray of students with a particular major, the name of that major, 
        //and prints the information for those students

    //Add the method getMajor that asks the user to enter a major and then returns the user input

    //Add the method printError that takes an error message and prints it to the console
}