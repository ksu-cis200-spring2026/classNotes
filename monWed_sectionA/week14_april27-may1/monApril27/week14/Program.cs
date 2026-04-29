// See https://aka.ms/new-console-template for more information

//ask for a user's age and name
//print hello to them and their age

/*
Console.Write("Enter your name: ");
string name = Console.ReadLine();

Console.Write("Enter you age: ");
int age = Convert.ToInt32(Console.ReadLine());

//print: Hello, John. You are 20 years old.
Console.WriteLine($"Hello, {name}. You are {age} years old");
*/

//Bob, age 15
Person p = new Person(){Name = "Bob", Age = 15};
p.Age = -100;
p.Print();
