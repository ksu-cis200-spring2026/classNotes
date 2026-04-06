//what should we do with Person?

public class Student extends Person {
    //want name, age, major, gpa

    private String major;
    private double gpa;

    public Student(String n, int a, String m, double g) {
        //first thing in the child constructor
        //call the parent constructor
        super(n, a);

        major = m;
        gpa = g;
    }


    public String getType() {
        return "Student";
    }

    public boolean honorRoll() {
        return gpa >= 3.5;
    }

    public String toString() {
        return String.format("%s, age %d, major %s, gpa %.2f", name, age, major, gpa);
    }
    //what do we inherit? 

    //what do we want to change?
}