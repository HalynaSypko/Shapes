package shape;

public class Shapes1 {
    public static void main(String[] args) {
        Rectangle1 rectangle = new Rectangle1(3.0, 4.0, 90.0);
        System.out.println("Rectangle");
        System.out.println("Area is: "+rectangle.area());
        System.out.println("Perimetr is: "+rectangle.perimeter());

        Square1 square = new Square1(3.0, 3.0, 90.0);
        System.out.println("Square");
        System.out.println("Area is: "+square.area());
        System.out.println("Perimetr is: "+square.perimeter());

        Rhombus1 rhombus = new Rhombus1(3.0, 3.0, 60.0);
        System.out.println("Rhombus");
        System.out.println("Area is: "+rhombus.area());
        System.out.println("Perimetr is: "+rhombus.perimeter());

        Parallelogram1 parallelogram = new Parallelogram1(3.0, 5.0, 30.0);
        System.out.println("Parallelogram");
        System.out.println("Area is: "+parallelogram.area());
        System.out.println("Perimetr is: "+parallelogram.perimeter());

        Circle1 circle = new Circle1(3.0);
        System.out.println("Circle");
        System.out.println("Area is: "+circle.area());
        System.out.println("Circuit is: "+circle.perimeter());

        Triangle1 triangle = new Triangle1(3.0, 3.0,3.0);
        System.out.println("Triangle");
        System.out.println("Area is: "+triangle.area());
        System.out.println("Circuit is: "+triangle.perimeter());
    }
}
