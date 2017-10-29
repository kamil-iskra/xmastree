package com.company;

public class DownTreeBuilder implements TreeBuilder {
    @Override
    public void build(int level, String item) {
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
    }
}
