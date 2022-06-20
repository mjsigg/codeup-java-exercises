package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);
    public Input(){}

    public boolean yesNo() {
        System.out.println("say yes or no ");
        String answer = scanner.nextLine();

        if(answer.equals("y") || answer.equals("yes")) {
            return true;
        }else
            return false;
    }


    public int getInt() {
        System.out.println("Gimme a number.");
        int answer = scanner.nextInt();
        scanner.nextLine();
        return answer;
    }

    int getInt(int min, int max) {
        System.out.format("Gimme a number between %d and %d\n",min,max );
        int answer = scanner.nextInt();

        if (answer < min || answer > max) {
            return getInt(min,max);
        }else

            return answer;
    }

    double getDouble() {
        System.out.println("Gimme a number.");
        double answer = scanner.nextDouble();
        return answer;
    }

    double getDouble(double min, double max) {
        System.out.format("Gimme a number between %.1f and %.1f\n",min,max );
        double answer = scanner.nextDouble();

        if (answer < min || answer > max) {
            return getDouble(min,max);
        }else

            return answer;
    }

    String getString() {
        System.out.println("Tell me something in explicit detail.");
        String answer = scanner.nextLine();
        return answer;
    }


}
