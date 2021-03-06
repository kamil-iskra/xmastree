package com.company;

public class RightTreeBuilder implements TreeBuilder {
    @Override
    public void build(int level, String item) {
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
    }
}
