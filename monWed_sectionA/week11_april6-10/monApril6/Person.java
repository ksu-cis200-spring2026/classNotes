public class Person {
    protected String name;
    protected int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public String getType() {
        return "Person";
    }

    @Override
    public String toString() {
        return String.format("%s, age %d", name, age);
    }

    public void birthday() {
        age++;
    }
}