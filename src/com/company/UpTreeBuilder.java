package com.company;

public class UpTreeBuilder implements TreeBuilder {
    public void build(int level, String item){
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
    }
}
