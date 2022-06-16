import java.util.Scanner;

public class MethodsPractice {
    Scanner scan = new Scanner(System.in);

    public static int getDifference(int x, int y) {
        return x - y;
    }

    public static int getAdding(int x, int y) {
        return x + y;
    }

    public static int getDivision(int x, int y) {
        return x / y;
    }

    public static int getMultiplication(int x, int y) {
        return x * y;
    }

    public static int getModulo(int x, int y) {
        return x % y;
    }

    public static int getLoopingMulti(int x, int y) {
        for (int count = 0; count <= 1; ++count) {
            x *= y;
        }
        return x *= y;

    }

    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }

    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between " + min + " and " + max);
        int userInt = scan.nextInt();

        if (userInt < min || userInt > max) {
            return getInteger(min, max);
        }
        return userInt;
    }

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

//    public static int letsCount(int min, int max) {
//        Scanner scan = new Scanner(System.in);
//        System.out.format("Please enter a minimum value.");
//        min = scan.nextInt();
//        System.out.println("Please enter a maximum value.");
//        max = scan.nextInt();
//
//        if (min != scan.nextInt() || max != scan.nextInt()) {
//            return letsCount(min, max);
//        }
//        return min & max;
//    }

//    public static void factorial() {
//        Scanner scan = new Scanner(System.in);
//        String willContinue;
//
//        do {
//            int userInput = getInteger(1, 10);
//            long userFactorial = 1;
//            for (int i = 1; i <= userInput; i++) {
//                userFactorial *= i;
//            }
//            System.out.println(userFactorial);
//            System.out.println("Do you want to continue? Please enter (yes/no)");
//            willContinue = scan.next();
//        } while (willContinue.equalsIgnoreCase("yes"));
//
//    }

    public static void rollDice() {
        Scanner scan = new Scanner(System.in);
        String userResponseContinue;

        System.out.println("Ay mang, how many sides yo dice has?");
        int sidesOnDie = scan.nextInt();
        System.out.println("Yo, you wanna roll some dice?");
        userResponseContinue = scan.next();
        int firstDie = (int) (Math.random() * sidesOnDie) + 1;
        int secondDie = (int) (Math.random() * sidesOnDie) + 1;

        System.out.printf("First roll: %d \n" +
                "Second roll: %d \n", firstDie,secondDie);
    }


        public static void main (String[]args) {

//        factorial();
        rollDice();
//        count(5);
//
//        int userNum = getInteger(1, 15);
//        System.out.println(userNum);

//        System.out.println("Enter sides of the die.");
//        var theDie = scan.nextInt();
//
//        System.out.printf("");

//        System.out.println(letsRoll(roll1,roll2));
//        for (int i = 1; i <= 5; i++) {
//            for(int num2 = i; num2 <= i; num2++) {
//                System.out.println(i + "! = " + num2 + " x " + (num2 + i-1) + " = " + (i * num2 ));
//            }
//            System.out.println();
//        }

//        int rows = 5;
////
//        for (int i = 1; i <= rows; ++i) {
//            for (int j = 1; j <= i; ++j) {
//                System.out.print(i + "!");
//            }
//            System.out.println();

//        myFactorialTest(5);

//        System.out.println("Ay mang, what dat number is?");
//        int userInputNumba = scan.nextInt();
//        System.out.println("Both of em.");
//        int userInputNumba2 = scan.nextInt();
//        String changeMe = "hello codeup";
//        System.out.println(changeMe);

//        System.out.println(getDifference(userInputNumba,userInputNumba2));
//        System.out.println(getAdding(userInputNumba,userInputNumba2));
//        System.out.println(getMultiplication(userInputNumba,userInputNumba2));
//        System.out.println(getDivision(userInputNumba,userInputNumba2));
//        System.out.println(getModulo(userInputNumba,userInputNumba2));
//        System.out.println(getPower(userInputNumba,userInputNumba2));
        }

    }






