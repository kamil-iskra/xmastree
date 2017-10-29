package com.company;

public class UpTreeBuilder implements TreeBuilder {
    public void build(int lvl, String item){
        int k = 0;

        for (int i = 1; i <= lvl; ++i, k = 0) {
            for (int space = 1; space <= lvl - i; ++space) {
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
