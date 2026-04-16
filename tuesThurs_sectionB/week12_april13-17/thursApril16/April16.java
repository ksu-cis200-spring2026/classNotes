import java.util.*;

public class April16 {
    public static void main(String[] args) {
        //create a TreeSet of type Person
        //add a few

        TreeSet<Person> people = new TreeSet<Person>();

        //add Bob, age 20
        people.add(new Person("Bob", 20));
        people.add(new Person("Alice", 10));
        people.add(new Person("Bob", 25));
        people.add(new Person("Chad", 30));
        people.add(new Person("Bob", 20));
        
        //print everything
        for (Person p : people) {
            System.out.println(p);
        }
    }
}