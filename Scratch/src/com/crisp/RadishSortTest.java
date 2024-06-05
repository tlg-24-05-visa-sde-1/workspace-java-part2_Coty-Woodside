package com.crisp;

import java.util.ArrayList;
import java.util.List;

class RadishSortTest {
    public static void main(String[] args) {
        List<Radish> radishes = new ArrayList<>();

        radishes.add(new Radish("red", 1.5, 2.5, 5));
        radishes.add(new Radish("white", 1.0, 0.0, 0));
        radishes.add(new Radish("black", 2.7, 5.5, 0));
        radishes.add(new Radish("pink", 0.9, 0, 6));
        System.out.println("original list" );
        dump(radishes);

        System.out.println( "sorted list (size)" );
        radishes.sort(null);
        dump(radishes);

        System.out.println("sort by color via comparator class");
        radishes.sort(new RadishColorComparator());
        dump(radishes);

        System.out.println("sort by GuysOnTop comparator class");
        radishes.sort(new RadishGuysOnTopComparator());
        dump(radishes);
    }

    private static void dump(List<Radish> radishList) {
        for (Radish radish : radishList) {
            System.out.println(radish);
        }
        System.out.println();
    }
}
