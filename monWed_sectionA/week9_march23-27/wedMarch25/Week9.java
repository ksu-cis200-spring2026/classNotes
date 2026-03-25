public class Week9 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.getRadius());

        //find area of circle with radius 2.5
        //first with "general" class/object
        Circle c2 = new Circle(2.5);
        System.out.println(c2.area());

        //then with CircleStatic
        System.out.println(CircleStatic.area(2.5));

        //how to hold 5 circles?
        Circle[] shapes = new Circle[5];
        //right now, every value is null


        //how to make first circle have radius 4?
        shapes[0] = new Circle(4);
        System.out.println(shapes[0].area());
        System.out.println(shapes[0]);
    }
}