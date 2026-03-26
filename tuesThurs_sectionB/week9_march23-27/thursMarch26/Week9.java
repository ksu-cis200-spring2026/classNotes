public class Week9 {
    public static void main(String[] args) {
        //find area of circle with radius 2.5

        //first with "general" class/object
        Circle c = new Circle(2.5);
        System.out.println(c.area());
        double val = c.getRadius();

        System.out.println(c);

        //then with CircleStatic
        System.out.println(CircleStatic.area(2.5));

        //how to hold 5 circles?
        Circle[] shapes = new Circle[5];
        
        //how to make first circle have radius 4?
    }
}