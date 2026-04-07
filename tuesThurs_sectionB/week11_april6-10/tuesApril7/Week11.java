public class Week11 {
    public static void main(String[] args) {
        //create Person/Student objects

        Person s = new Student("Bob", 20, "ECE", 3.6);

        System.out.println(s.getType());
        System.out.println(s);
        
        if (s instanceof Student) {
            Student stud = (Student)s;
            if (stud.honorRoll()) {
                System.out.println("Congratulations!");
            }
        }
        

        //NO! People are not necessarily students
        //Student p = new Person("Joe", 25);
    }
}