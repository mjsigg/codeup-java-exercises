import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1
        System.out.println("Testing");
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n .", pi);

        //1a
        System.out.println("tThe value of pi is approximately " + pi + ".");

        // Explore the scanner class
        int gimmeNumber = scanner.nextInt();
        System.out.println(gimmeNumber);


//        System.out.println("Gimme a color.");
//        String userInput1 = scanner.nextLine();
//        System.out.printf("\nYou put in, %s", userInput1);
//
//        System.out.printf("\nGimme a number.");
//        int userInput2 = scanner.nextInt();
//        System.out.printf("\nYou put in the number, %d.",userInput2);

        System.out.println("\n Gimme 3 words.");
        String userWord1 = scanner.nextLine();
        String userWord2 = scanner.nextLine();
        String userWord3 = scanner.nextLine();
        System.out.printf("\n Your words were, %s,%s,%s.", userWord1,userWord2,userWord3);

        System.out.println("\n Knock,knock.");
        String answer = scanner.nextLine();
        System.out.printf("\n You answered, %s", answer);

        ///classroom part

        /// 1

        System.out.println("Gimme length.");
        int roomLength = scanner.nextInt();
        System.out.println("Gimme width.");
        int roomWidth = scanner.nextInt();
        roomWidth = 10;
        roomLength = 10;

        //// 2
        int roomRectangle = roomLength * roomWidth;
        int roomPerimeter = 2 * (roomRectangle);
        System.out.println(roomRectangle);
        System.out.println(roomPerimeter);


    }
}
