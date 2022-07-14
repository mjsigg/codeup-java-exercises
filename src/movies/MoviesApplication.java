package movies;

import util.Input;

import java.util.*;

public class MoviesApplication {


    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        Movie[] movieStuff = MoviesArray.findAll();

        System.out.println(
                "0 - menu\n" +
                        "1 - view all movies\n" +
                        "2 - view movies in the animated category\n" +
                        "3 - view movies in the drama category\n" +
                        "4 - view movies in the horror category\n" +
                        "5 - view movies in the scifi category\n");

        System.out.println("Please pick an option.");
        int userInput = scanner.nextInt();

        for (Movie i : movieStuff) {
            String movieName = i.getName();
            String movieCategory = i.getCategory();

            if (userInput == 1) {
                System.out.println(i.getName());

            }if (userInput == 2) {
                if (i.getCategory().equals("animated")) {
                    System.out.println(i.getName());
                }
            }if (userInput == 3) {
                if (i.getCategory().equals("drama")) {
                    System.out.println(i.getName());
                }
            }if (userInput == 4) {
                if (i.getCategory().equals("horror")) {
                    System.out.println(i.getName());
                }
            }if (userInput == 5) {
                if (i.getCategory().equals("scifi")) {
                    System.out.println(i.getName());
                }
            }

        }
        showMenu();
    }

    public static void main(String[] args) {
        showMenu();


        }
    }



