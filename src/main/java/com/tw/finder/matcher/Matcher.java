package com.tw.finder.matcher;

public interface Matcher<T> {
    boolean matches(T actual);

    static <T> Matcher<T> eq(T expected) {
        return actual -> expected.equals(actual);
    }

    static <T> Matcher<T> ne(T expected) {
        return actual -> !expected.equals(actual);
    }


}