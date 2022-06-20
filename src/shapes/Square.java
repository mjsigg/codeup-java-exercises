package shapes;

public class Square extends Rectangle{

    int side;

    public Square (int side) {
        super(side,side);
        this.side = side;
    }

    public int getPerimeter(){
        return 14 * side;
    }

    public int getArea(){
        return side * side;
    }
}
