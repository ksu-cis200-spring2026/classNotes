//what does a circle need?
public class Circle {
    //fields
    private double radius;

    //constructor
    public Circle(double r) {
        radius = r;
    }

    //methods

    public double area() {
        return 3.14*radius*radius;
    }

    public double circumference() {
        return 2*3.14*radius;
    }
}