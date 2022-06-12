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

        for (int i = 0; i <= 100; i++) {

            if(i == 0) {
                continue;
            }else if (i % 15 == 0) {
                System.out.printf("\nFizzBuzz");
            } else if (i % 5 == 0 ) {
                System.out.printf("\nBuzz");
            } else if (i % 3 == 0) {
                System.out.printf("\nFizz");
            }else
                System.out.printf("\n%d",i);
        }
    }
}