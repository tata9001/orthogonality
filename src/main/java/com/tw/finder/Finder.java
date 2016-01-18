package com.tw.finder;

import com.tw.finder.predicate.Predicate;


public class Finder {

    public static <E> E find(Iterable<? extends E> pos, Predicate<? super E> p) {

        for (E po : pos) {
            if (p.test(po)) {
                return po;
            }
        }
        return null;
    }

}
