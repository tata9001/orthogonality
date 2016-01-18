package com.tw.finder;

import com.tw.finder.predicate.Predicate;

import java.util.Optional;


public class Finder {

    public static <E> Optional<E> find(Iterable<? extends E> pos, Predicate<? super E> p) {

        for (E po : pos) {
            if (p.test(po)) {
                return Optional.of(po);
            }
        }
        return Optional.empty();
    }

}
