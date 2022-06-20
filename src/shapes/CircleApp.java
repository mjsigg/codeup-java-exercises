package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input prompt = new Input();

        boolean decision = true;

        while(decision) {
            int gimmeNumba = prompt.getInt();
            Circle stupidThing = new Circle(gimmeNumba);
            System.out.println(stupidThing.getArea());
            System.out.println(stupidThing.getCircumference());
            System.out.println("Do you still wanna keep going?");
            decision = prompt.yesNo();
        }

    }
}
