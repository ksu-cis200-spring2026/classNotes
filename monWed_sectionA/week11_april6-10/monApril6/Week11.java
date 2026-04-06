public class Week11 {
    public static void main(String[] args) {
        Person s = new Student("Bob", 20, "ECE", 3.6);

        //if this person is a student
        //then give them congrats if they're on the honor roll
        if (s instanceof Student) {
            Student stud = (Student)s;
            if (stud.honorRoll()) {
                System.out.println("Kudos!");
            }
        }

        System.out.println(s.getType());
        System.out.println(s);

        //no!
        //Student another = new Person("joe", 20);

        //create Person/Student/Employee objects

        //store all together
    }
}