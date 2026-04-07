//what should we do with Person?

public class Student extends Person {
    //want name, age, major, gpa
    private String major;
    private double gpa;

    public Student(String n, int a, String m, double g) {
        super(n, a);
        major = m;
        gpa = g;
    }

    public boolean honorRoll() {
        return gpa >= 3.5;
    }

    @Override
    public String getType() {
        return "Student";
    }

    public String toString() {
        StringBuilder build = new StringBuilder();

        //append the name and age
        build.append(super.toString());
        build.append(String.format(" major: %s, gpa: %.2f", major, gpa));
        return build.toString();
    }

    //what do we inherit? 

    //what do we want to change?
}