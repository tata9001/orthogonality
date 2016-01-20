package com.tw.finder;


import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;


public class Finder {

    public static <E> Optional<? extends E> find(Collection<? extends E> pos, Predicate<? super E> p) {
        return pos.stream().filter(p).findFirst();
    }

}
