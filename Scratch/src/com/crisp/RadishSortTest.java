package com.crisp;

import java.util.ArrayList;
import java.util.Comparator;
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
        //radishes.sort(new RadishColorComparator());
        radishes.sort(new Comparator<Radish>() {
            @Override
            public int compare(Radish r1, Radish r2) {
                return r1.getColor().compareTo(r2.getColor());
            }
        });
        dump(radishes);

        System.out.println("sort by GuysOnTop comparator class");
       // radishes.sort(new RadishGuysOnTopComparator());
        radishes.sort(new Comparator<Radish>() {
            @Override
            public int compare(Radish r1, Radish r2) {
                return Integer.compare(r1.getGuysOnTop(), r2.getGuysOnTop());
            }
        });
        dump(radishes);

        System.out.println("sort by tailLength via anonymous class");
        radishes.sort(  new Comparator<Radish>() {
            @Override
            public int compare(Radish r1, Radish r2) {
                return Double.compare(r1.getTailLength(), r2.getTailLength());
            }
        }  );
        dump(radishes);
    }

    private static void dump(List<Radish> radishList) {
        for (Radish radish : radishList) {
            System.out.println(radish);
        }
        System.out.println();
    }
}
