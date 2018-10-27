//package org.pursuit;
//
//import java.util.Scanner;
//
//public class Pathfinder implements Game {
//
//    Scanner scanner = new Scanner(System.in);
//    int tile;
//    int roll;
//
//    @Override
//    public void startGame() {
//        logo();
//        instructions();
//        tile = 1;
//        checkValue();
//    }
//
//    private void logo() {
//        System.out.println("######                      #######\n" +
//                "#     #   ##   ##### #    # #       # #    # #####  ###### #####\n" +
//                "#     #  #  #    #   #    # #       # ##   # #    # #      #    #\n" +
//                "######  #    #   #   ###### #####   # # #  # #    # #####  #    #\n" +
//                "#       ######   #   #    # #       # #  # # #    # #      #####\n" +
//                "#       #    #   #   #    # #       # #   ## #    # #      #   #\n" +
//                "#       #    #   #   #    # #       # #    # #####  ###### #    #");
//    }
//
//    private void instructions() {
//        System.out.println("\nInstructions:\n" +
//                "\n" +
//                "This game is called 'PathFinder'. The goal of this game is to reach the end of the path, 100 tiles.\n" +
//                "You start at the first tile, then press enter to roll.\n" +
//                "You can roll any number from 1 to 10 - then move that number of tiles forward.\n" +
//                "If you roll a 7, you get to move 7 tiles, plus a random roll between 1 an 10.\n" +
//                "If you roll a 10, you move back a random roll from between 1 and 10.\n" +
//                "If the random roll is greater than your current tile, you move back to the first tile.\n" +
//                "Good luck!\n");
//    }
//
//    private void input() {
//        System.out.print("\nPress 'enter' to roll...");
//        scanner.nextLine();
//        roll = roll();
//    }
//
//    private int roll() {
//        int random = (int) Math.ceil(Math.random() * 10);
//        return random;
//    }
//
//    private void checkValue() {
//        do {
//            System.out.println("Current Tile: " + tile);
//            System.out.println("Tiles to Go: " + (100 - tile));
//            input();
//            int newRoll = roll();
//            if (roll == 7) {
//                System.out.println("\nGreat luck! You've rolled a 7! Move forward your roll, plus " + newRoll + " extra spaces!");
//                tile = tile + roll + newRoll;
//            } else if (roll == 10) {
//                if (tile <= 10 && newRoll >= tile) {
//                    System.out.println("\nOh no! You've rolled a 10! Move back to the first tile!");
//                    tile = 1;
//                } else {
//                    System.out.println("\nOh no! You've rolled a 10! Move back " + newRoll + " spaces!");
//                    tile = tile - newRoll;
//                }
//            } else {
//                System.out.println("\nYou've rolled a " + roll + "!");
//                tile = tile + roll;
//            }
//        } while (tile < 100);
//        System.out.println("Congrats! You've reached the end of the path!");
//        gameOverMaybe();
//    }
//
//    private void gameOverMaybe() {
//
//        String input;
//        do {
//            System.out.print("Play Again? [Y/n]: ");
//            input = scanner.nextLine();
//            if (input.length() == 0 || input.charAt(0) == 'y' || input.charAt(0) == 'Y') {
//                startGame();
//                break;
//            } else if (input.charAt(0) == 'n' || input.charAt(0) == 'N') {
//                System.out.println("Goodbye! Thanks for playing 'PathFinder'!");
//                break;
//            } else {
//                System.out.println("Sorry, does not compute...");
//            }
//        }
//        while (input.length() != 0 || input.charAt(0) != 'y' || input.charAt(0) != 'Y' || input.charAt(0) != 'n' || input.charAt(0) != 'N');
//    }
//}