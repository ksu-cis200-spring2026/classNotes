public class Person {
    private int _age;

    public string Name {get; init;}


    public int Age
    {
        get{
            return _age;
        }
        set {
            //restrict to 0-120
            if (value >= 0 && value <= 120) {
                _age = value;
            }
            else {
                _age = 0;
            }
        }
    }

    public void Birthday() {
        _age++;
    }

    public void Print() {
        Console.WriteLine("{_name} is {_age} years old", _name, _age);
    }
}