import java.util.Scanner;
import java.util.function.DoubleFunction;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ///1
        //a

//        int integer = 5;

        for (int i = 5; i <= 15; i++) {
            System.out.printf("%d ", i);
        }

        // 1
        // b
//
//do {
//    for (int i = 0; i <= 100; i += 2) {
//        System.out.printf("%d\n", i);
//    }

//    for (int i = 100; i >= -10; i -= 5) {
//        System.out.printf("%s\n", i);
//    }

//    for (long i = 2; i <= 10000000; i *= i) {
//        System.out.printf("%d\n",i);
//    }


        //2
//        for (int i = 0; i <= 100; i++) {
//
//            if(i == 0) {
//                System.out.printf("\n%d",i);;
//            }else if (i % 15 == 0 ) {
//                System.out.printf("\nFizzBuzz");
//            } else if (i % 5 == 0 ) {
//                System.out.printf("\nBuzz");
//            } else if (i % 3 == 0) {
//                System.out.printf("\nFizz");
//            }else
//                System.out.printf("\n%d",i);
//        }

        //3


        System.out.printf("\n\nPlease enter a number.\n");
        int userInput = in.nextInt();
        System.out.printf("You entered the number: %d", userInput);

        if (userInput == userInput) {


            for (int count = 1; count <= userInput; count++) {
                System.out.printf("number |  squared  |  cubed\n");
                System.out.printf("%d---- |  %d------ |  %d---\n", count,count,count);
            }
        }


        //4

//        String gradesA = ("\nA: 100 - 88");
//        String gradesB = ("\nB: 87 - 80");
//        String gradesC = ("\nC: 79 - 67");
//        String gradesD = ("\nD: 66 - 60");
//        String gradesF = ("\nF: 59 - 0");

//        System.out.printf("\nPlease input your grade.");
//        int printGrade = in.nextInt();
//
//        if(printGrade >= 88) {
//            System.out.printf("%s", gradesA);
//        }else if (printGrade <= 87 && printGrade >= 80) {
//            System.out.printf("%s", gradesB);
//        }else if (printGrade <= 79 && printGrade >= 67 ) {
//            System.out.printf("%s", gradesC);
//        }else if (printGrade <= 66 && printGrade >= 60) {
//            System.out.printf("%s", gradesD);
//        }else if (printGrade <= 59) {
//            System.out.printf("%s", gradesF);
//        }


    }


}