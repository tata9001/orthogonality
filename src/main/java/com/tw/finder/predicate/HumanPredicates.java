package com.tw.finder.predicate;

import com.tw.finder.po.Human;

import java.util.function.Predicate;

/**
 * Created by yunwang on 1/18/16.
 */
public class HumanPredicates {

    public static <E extends Human> Predicate<E> name(Predicate<String> m) {
        return s -> m.test(s.getName());
    }

    public static <E extends Human> Predicate<E> age(Predicate<Integer> m) {
        return s -> m.test(s.getAge());
    }

    public static <E extends Human> Predicate<E> male(Predicate<Boolean> m) {
        return s -> m.test(s.isMale());
    }
}
