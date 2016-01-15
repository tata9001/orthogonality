package com.tw.finder;

import com.tw.finder.predicate.Predicate;


public class Finder {

    public static <E> E find(Iterable<E> pos, Predicate p) {

        for (E po : pos) {
            if (p.test(po)) {
                return po;
            }
        }
        return null;
    }

}
