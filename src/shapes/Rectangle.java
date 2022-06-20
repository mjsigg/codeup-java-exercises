package shapes;

public class Rectangle {
    int length;
    int width;
    int getArea;
    int getPerimeter;

    //constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return 2 * length + 2 * width;
    }

    public int getPerimeter() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle box = new Rectangle(2,2);
        System.out.println(box.length);
        System.out.println(box.width);


    }
}
