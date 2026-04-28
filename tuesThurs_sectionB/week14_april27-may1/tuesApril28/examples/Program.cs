// See https://aka.ms/new-console-template for more information

//ask the user for their name and age
//print: Hello, Bob. You are 20 years old.

/*
Console.Write("Enter your name: ");
string name = Console.ReadLine();
Console.Write("Enter your age: ");
int age = Convert.ToInt32(Console.ReadLine());

Console.WriteLine($"Hello, {name}. You are {age} years old");
*/

//Person Bob, 20
Person p = new Person(){Name = "Bob", Age = 20};
//no, can't change name because no set
//p.Name = "Joe";
p.Age = 50;
p.Print();
