package com.crisp;

import java.util.Comparator;

class RadishGuysOnTopComparator implements Comparator<Radish> {
    @Override
    public int compare(Radish radish1, Radish radis2) {
        return Integer.compare(radish1.getGuysOnTop(), radis2.getGuysOnTop());
    }
}
