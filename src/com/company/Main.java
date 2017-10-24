package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String item, direction;
        int level;

        Scanner inLevel = new Scanner(System.in);
        Scanner inChar = new Scanner(System.in);
        Scanner inDirection = new Scanner(System.in);

        System.out.println("Enter a level (number from 1 to 9)");
        while (!inLevel.hasNext("[1-9]")) {
            System.out.println("That's not a valid number!");
            inLevel.next();
        }
        level = Integer.parseInt(inLevel.next());
        System.out.println("You entered level: " + level);
        //
        System.out.println("Enter a one char (alphabetic and special chars allowed)");
        while (!inChar.hasNext("[A-Za-z`!@#$%^&*()-_+=]{1}")) {
            System.out.println("That's not a valid char!");
            inChar.next();
        }
        item = inChar.next();
        System.out.println("You entered char: " + item);

        System.out.println("Enter a tree direction (up, down, left, right");
        while (!inDirection.hasNext("\\bup\\b|\\bdown\\b|\\bleft\\b|\\bright\\b")) {
            System.out.println("That's not a correct direction!");
            inDirection.next();
        }
        direction = inDirection.next();
        System.out.println("Direction: " + direction);

        switch (direction) {
            case "up": {
                int k = 0;

                for (int i = 1; i <= level; ++i, k = 0) {
                    for (int space = 1; space <= level - i; ++space) {
                        System.out.print(" ");
                    }

                    while (k != 2 * i - 1) {
                        System.out.print(item);
                        ++k;
                    }

                    System.out.println();
                }
                break;
            }

            case "down": {

                for (int i = level; i >= 1; --i) {
                    for (int space = 1; space <= level - i; ++space) {
                        System.out.print(" ");
                    }

                    for (int j = i; j <= 2 * i - 1; ++j) {
                        System.out.print(item);
                    }

                    for (int j = 0; j < i - 1; ++j) {
                        System.out.print(item);
                    }

                    System.out.println();
                }
                break;
            }

            case "left": {

                for (int i = 1; i < level; ++i) {

                    for (int space = level - i; space >= 1; --space) {
                        System.out.print(" ");
                    }

                    for (int j = 2 * i - 1; j >= i; --j) {
                        System.out.print(item);
                    }

                    System.out.println();
                }

                for (int i = level; i >= 1; --i) {

                    for (int space = 1; space <= level - i; ++space) {
                        System.out.print(" ");
                    }

                    for (int j = i; j <= 2 * i - 1; ++j) {
                        System.out.print(item);
                    }

                    System.out.println();
                }
                break;
            }

            case "right": {

                for (int i = level; i >= 1; --i) {

                    for (int space = 1; space <= level - i + 1; ++space) {
                        System.out.print(item);
                    }

                    for (int j = i; j <= 2 * i - 1; ++j) {
                        System.out.print(" ");
                    }

                    System.out.println();
                }

                for (int i = 1; i <= level; ++i) {

                    for (int space = level - i; space >= 1; --space) {
                        System.out.print(item);
                    }

                    for (int j = 2 * i - 1; j >= i; --j) {
                        System.out.print(" ");
                    }

                    System.out.println();
                }
                break;
            }

            default:
                System.out.println("Nieprawidowy kierunek!");
        }
    }
}
