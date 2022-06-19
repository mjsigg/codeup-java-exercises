package util;

public class InputTest {
    public static void main(String[] args) {
        Input something = new Input();

        boolean eat = something.yesNo();
        System.out.println(eat);
        System.out.println(something.getInt());
        System.out.println(something.getInt(1,3));
        System.out.println(something.getDouble());
        System.out.println(something.getDouble(12,45));
        System.out.println(something.getString());

    }
}
