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
        StringBuilder build = new StringBuilder();

        //append the name/age information
        //calls toString in Person
        build.append(super.toString());
        build.append(String.format("major %s, gpa %.2f", major, gpa);

        return build.toString();
    }
    //what do we inherit? 

    //what do we want to change?
}