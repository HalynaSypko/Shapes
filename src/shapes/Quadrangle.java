package shapes;

public class Quadrangle extends GShapes {
    public double side1;
    public double side2;
    public double angle;


    public Quadrangle(double side1, double side2, double angle) {
        this.side1 = side1;
        this.side2 = side2;
        this.angle = angle;
    }

    public double area() {
        return side1 * side2 * Math.sin(Math.toRadians(angle));
    }

    public double perimeter() {

        return side1 * 2 + side2 * 2;
    }


}
