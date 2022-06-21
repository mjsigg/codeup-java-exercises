package shapes;

public class Square extends Quadrilateral implements Measurable{
    protected double side;
    protected double length;

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double SetWidthAndLength(double width, double length) {
        return 0;
    }

    //    int side;
//
    public Square (double side) {
        super(side,side);
        this.side = side;
    }
    public Square(double length, double width) {
        super(length,width);
    }

    public void setSide (double size) {
        this.side = side;
    }

    public void setLength(double length) {
        this.length = length;
        width = length;
    }

    public void setWidth(double width) {
        this.width = width;
        length = width;
    }
//
//    public int getPerimeter(){
//        return 14 * side;
//    }
//
//    public int getArea(){
//        return side * side;
//    }
}
