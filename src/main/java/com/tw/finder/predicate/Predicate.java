package com.tw.finder.predicate;

public interface Predicate<E> {
    boolean test(E e);

    default Predicate<E> and(Predicate<? super E> other) {
        return e -> test(e) && other.test(e);
    }
}