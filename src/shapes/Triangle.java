package shapes;

public class Triangle extends GShapes {
    public double side3;
    public double side4;
    public double side5;

    public Triangle(double side3, double side4, double side5) {
        this.side3 = side3;
        this.side4 = side4;
        this.side5 = side5;
    }

    @Override
    public double area() {
        return Math.sqrt((side3 + side4 + side5) * 0.5 * ((side3 + side4 + side5) * 0.5 - side3) * ((side3 + side4 + side5) * 0.5 - side4) * ((side3 + side4 + side5) * 0.5 - side5));
    }

    public double perimeter() {
        return side3 + side4 + side5;
    }
}

