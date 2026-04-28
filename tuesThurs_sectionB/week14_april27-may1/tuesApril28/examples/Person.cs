public class Person {
    private int _age;

    public int Age {
        get {
            return _age;
        }
        set {
            //only want age to be 0-120
            if (value >= 0 && value <= 120) {
                _age = value;
            }
        }
    }

    public string Name { get; init; }

    public void Print() {
        Console.WriteLine($"Name: {Name}, age: {Age} years old");
    }
}