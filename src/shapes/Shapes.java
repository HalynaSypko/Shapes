package shapes;

public class Shapes {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.0, 4.0, 90.0);
        System.out.println("Rectangle");
        System.out.println("Area is: " + rectangle.area());
        System.out.println("Perimetr is: " + rectangle.perimeter());

        Square square = new Square(3.0, 3.0, 90.0);
        System.out.println("Square");
        System.out.println("Area is: " + square.area());
        System.out.println("Perimetr is: " + square.perimeter());

        Rhombus rhombus = new Rhombus(3.0, 3.0, 60.0);
        System.out.println("Rhombus");
        System.out.println("Area is: " + rhombus.area());
        System.out.println("Perimetr is: " + rhombus.perimeter());

        Parallelogram parallelogram = new Parallelogram(3.0, 5.0, 30.0);
        System.out.println("Parallelogram");
        System.out.println("Area is: " + parallelogram.area());
        System.out.println("Perimetr is: " + parallelogram.perimeter());

        Circle circle = new Circle(3.0);
        System.out.println("Circle");
        System.out.println("Area is: " + circle.area());
        System.out.println("Circuit is: " + circle.perimeter());

        Triangle triangle = new Triangle(3.0, 3.0, 3.0);
        System.out.println("Triangle");
        System.out.println("Area is: " + triangle.area());
        System.out.println("Circuit is: " + triangle.perimeter());
    }
}
