import java.io.PrintStream;
import java.util.Scanner;

public class HighLow {
    public static void playGame() {
        Scanner scan = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Guess the number between 1 and 100!");
        int userAnswer = scan.nextInt();

        if (userAnswer == randomNumber) {
            System.out.println("Nice!");
        }else if (userAnswer < randomNumber) {
            System.out.println("Higher");
        }else if (userAnswer > randomNumber) {
            System.out.println("Lower");
            playGame();
        }

    }
}
