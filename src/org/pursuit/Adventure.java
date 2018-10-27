package org.pursuit;

import java.util.Scanner;

public class Adventure {

    Scanner scanner = new Scanner(System.in);

    public void startGame() {
        logo();
        instructions();
        input();
        letter();
        number();

    }

    private void logo() {

        System.out.println("logo");
    }


    private void instructions() {
        System.out.println("choose your fate by selecting from the different choices");
    }


    private void input() {
        System.out.print("\nPress 'enter' to start your fate...");
        scanner.nextLine();

    }

    private void letter() {
        String choice1;

        System.out.println("You are walking home and you see a letter on the ground do you open it [Y/n]:");
        choice1 = scanner.nextLine();
        if (choice1.length() == 0 || choice1.charAt(0) == 'y' || choice1.charAt(0) == 'Y') {
            System.out.println("there is a phone number in the letter ");
            number();
        } else if (choice1.charAt(0) == 'n' || choice1.charAt(0) == 'N') {
            System.out.println("you make it home in one piece!");

        } else {
            System.out.println("try again");
        }

    }

    private void number() {
        String choice2;
        choice2 = scanner.nextLine();

        while (choice2 != "no") {
            System.out.println("do you call?");
            choice2 = scanner.nextLine();
            switch (choice2) {
                case "call":
                    run();
                    break;
                case "no":
                    gameOver();
                    break;
                default:
                    System.out.println("quick decide before its too late!");
            }
        }
    }

    private void run() {

        System.out.println("you hear someone yell Run! you start running home and hear a sound behind " +
                "you, do you turn to look? [Y/n]");


    }

    private void gameOver() {

        String response;
        do {
            System.out.print("Start over? [Y/n]: ");
            response = scanner.nextLine();
            if (response.length() == 0 || response.charAt(0) == 'y' || response.charAt(0) == 'Y') {
                startGame();
                break;
            } else if (response.charAt(0) == 'n' || response.charAt(0) == 'N') {
                System.out.println("Goodbye! Thanks for playing 'PathFinder'!");
                break;
            } else {
                System.out.println("Sorry, does not compute...");
            }
        }
        while (response.length() != 0 || response.charAt(0) != 'y' || response.charAt(0) != 'Y' || response.charAt(0) != 'n' || response.charAt(0) != 'N');
    }

//        String walk;
//        System.out.println("do you call?");
//        call = scanner.nextLine();
//        if (call == "call" || call == "Call" || call == "yes") {
//            System.out.println("you are brave, press enter");
//        } else if (call == "no" || call == "No") {
//            System.out.println("you should've called, you keep walking and meet a dog");
//            walk = scanner.nextLine();
//        } else {
//            System.out.println("try");
//        }
}





