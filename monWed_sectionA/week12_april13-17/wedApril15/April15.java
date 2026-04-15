import java.util.*;

public class April15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //create a TreeSet of type Person
        //add a few

        TreeSet<Person> set = new TreeSet<Person>();

        set.add(new Person("Bob", 25));
        set.add(new Person("Amy", 12));
        set.add(new Person("Bob", 20));
        set.add(new Person("Charlie", 35));
        set.add(new Person("Bob", 25));

        //print everything
        for (Person p : set) {
            System.out.println(p);
        }
    }
}