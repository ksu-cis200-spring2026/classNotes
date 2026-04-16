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

    public int compareTo(Person elem) {
        if (name.equals(elem.name)) {
            //compare the ages

            //return < 0 if "this" person comes before elem
            if (age < elem.age) {
                return -1;
            }
            else if (age > elem.age) {
                return 1;
            }
            else {
                return 0;
            }

            //return > 0 if "this" person comes after elem
        }
        else {
            return name.compareTo(elem.name);
        }
    }

    //sort first by name (alphabetically)
    //if same name, sort by age (youngest to oldest)
}