public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public String toString() {
        return String.format("Name: %s, age: %d%n", name, age);
    }

    public int compareTo(Person other) {
        if (name.equals(other.name)) {
            //do something with the ages
            //if this person's age < other's age
            if (age < other.age) {
                //return something < 0
                return -1;
            }
            else if (age > other.age) {
                //return something > 0
                return 1;
            }
            else {
                return 0;
            }
        }
        else {
            //different names
            return name.compareTo(other.name);
        }
    }

    //to compare people
    //first try to compare by name
    //if they have the same name, then next order by age
}