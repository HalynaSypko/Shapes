package shape;

public class Circle1 extends GShapes {
    public double radius;
    final double pi = Math.PI;

    public  Circle1 (double radius){
        this.radius = radius;
    }
    @Override
    public double area() {
        return pi * Math.pow(radius, 2);
    }

    public double perimeter() {
        return 2 * pi * radius;
    }

}
