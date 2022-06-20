import java.util.Scanner;
import java.io.*;
import java.lang.Thread;

public class ConsoleGame {
    static Scanner choice = new Scanner(System.in);

    static String userName;
    static byte hitPoints;
    static byte yoStrength;
    static Object badGuyData;


    public static String getName() {
        System.out.format("What yo name illz?");
        String userName = choice.nextLine();

        if (userName.trim().length() <= 0) {
            return getName();
        }
        return userName;
    }

    public static byte defineHP() {
        System.out.format("Lemme find how T H I C C you illz.\n" +
                "Imma bout to roll yo stats.\n");
        byte hitPointRoll = (byte) (Math.random() * 20 + 10);
        byte hitPoints = hitPointRoll;
        System.out.format("Yo HP illz %d \n", hitPoints);

        return hitPoints;
    }

    public static byte defineSwoleLevel() {
        System.out.printf("Aight, %s. What yo protein intake illz? \n", userName);
        byte strengthRoll = (byte) (Math.random() * 6 + 3);
        byte yoStrength = strengthRoll;

        System.out.format("Swoleness illz %d \n", yoStrength);
        if (strengthRoll > 6) {
            System.out.format("Dayum. Ok, I see you %s.\n", userName);
        } else
            System.out.format("Ch'mon %s. You soft.\n", userName);
        return yoStrength;
    }

//    public static Object defineBadGuy() {
//        String badGuyName = "Will Smith";
//        String attack1 = "Hurl Insults";
//        String ultimateAttack = "Big Ol' Slap";
//        byte hitPointRoll = (byte) (Math.random() * 10 + 10);
//        byte strengthRoll = (byte) (Math.random() * 6 + 3);
//        byte badGuyHP = hitPointRoll;
//        byte badGuyStr = strengthRoll;
//
//        return badGuyName();
//    }

    public static void main(String[] args) {

        int x = 5 * 4 % 3;
        System.out.println(x);

        try {
//                for (int i = 0; i <= 1; i++) {
            System.out.println("Ay");
            Thread.sleep(400);
            System.out.println("man");
            Thread.sleep(700);
            userName = getName();
            Thread.sleep(700);
            hitPoints = defineHP();
            Thread.sleep(700);
            yoStrength = defineSwoleLevel();
            Thread.sleep(1000);
            System.out.printf("Yo name: %s | ", userName);
            Thread.sleep(1000);
            System.out.printf(" Yo Thicness illz %d ", hitPoints);
            Thread.sleep(1000);
            System.out.printf("| Yo Swoleness illz %d\n", yoStrength);
            Thread.sleep(1000);
            System.out.println("Is");
            Thread.sleep(500);
            System.out.println("that");
            Thread.sleep(700);
            System.out.println("gucci");
            Thread.sleep(600);
            System.out.println("wit");
            Thread.sleep(200);
            System.out.println("you?");

//                }
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}

//        try {
//                System.out.printf("My name: %s | ", badGuyName);
//                Thread.sleep(1000);
//                System.out.printf("My Thicness illz %d ", badGuyHP);
//                Thread.sleep(1000);
//                System.out.printf("| My Swoleness illz %d\n", badGuyStr);
//                }
//                catch (Exception e) {
//                System.out.println(e);
//                }