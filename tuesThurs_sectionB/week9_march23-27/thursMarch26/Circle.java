public class Circle {
    //fields
    private double radius;

    //constructor
    public Circle(double r) {
        radius = r;
    }

    //getter method for the radius
    public double getRadius() {
        return radius;
    }

    //operations (circumference, area)
    public double circumference() {
        return 2*3.14*radius;
    }

    public double area() {
        return 3.14*radius*radius;
    }

    public String toString() {
        return String.format("Radius: %.2f, area: %.2f", radius, area());
    }
}