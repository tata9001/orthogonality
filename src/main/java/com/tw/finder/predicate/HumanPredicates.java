package com.tw.finder.predicate;

import com.tw.finder.matcher.Matcher;
import com.tw.finder.po.Human;

/**
 * Created by yunwang on 1/18/16.
 */
public class HumanPredicates {

    public static <E extends Human> Predicate<E> name(Matcher<String> m) {
        return s -> m.matches(s.getName());
    }

    public static <E extends Human> Predicate<E> age(Matcher<Integer> m) {
        return s -> m.matches(s.getAge());
    }

    public static <E extends Human> Predicate<E> male(Matcher<Boolean> m) {
        return s -> m.matches(s.isMale());
    }
}
