package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double SetWidthAndLength(double width, double length) {
        return 0;
    }
}
