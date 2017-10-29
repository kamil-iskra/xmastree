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
        System.out.println("Enter a one char (letters and special chars allowed)");
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

                UpTreeBuilder upTree = new UpTreeBuilder();
                upTree.build(level, item);

                break;
            }

            case "down": {

                DownTreeBuilder downTree = new DownTreeBuilder();
                downTree.build(level, item);

                break;
            }

            case "left": {

                LeftTreeBuilder leftTree = new LeftTreeBuilder();
                leftTree.build(level, item);

                break;
            }

            case "right": {

                RightTreeBuilder rightTree = new RightTreeBuilder();
                rightTree.build(level, item);

                break;
            }

            default:
                System.out.println("Wrong direction! Please enter valid value.");
        }
    }
}
