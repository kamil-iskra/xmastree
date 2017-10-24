package com.company;

public class Main {

    public static void main(String[] args) {

        int rows = 5, k = 0;

        for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print(" ");
            }

            while(k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }

            System.out.println();
        }

        System.out.println("-----------");

        int rows_2 = 5;

        for(int i = rows_2; i >= 1; --i) {
            for(int space = 1; space <= rows_2 - i; ++space) {
                System.out.print(" ");
            }

            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print("*");
            }

            for(int j = 0; j < i - 1; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("-----------");

        int rows_3 = 5;

        for(int i = 1; i < rows_3; ++i) {

            for(int space = rows_3 - i; space >= 1; --space) {
                System.out.print(" ");
            }

            for(int j=2 * i - 1; j >= i; --j) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = rows_3; i >= 1; --i) {

            for(int space = 1; space <= rows_3 - i; ++space) {
                System.out.print(" ");
            }

            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("-----------");

        int rows_4 = 4;

        for(int i = rows_4; i >= 1; --i) {

            for(int space = 1; space <= rows_4 - i + 1; ++space) {
                System.out.print("*");
            }

            for(int j=i; j <= 2 * i - 1; ++j) {
                System.out.print(" ");
            }

            System.out.println();
        }

        for(int i = 1; i <= rows_4; ++i) {

            for(int space = rows_4 - i; space >= 1; --space) {
                System.out.print("*");
            }

            for(int j=2 * i - 1; j >= i; --j) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
