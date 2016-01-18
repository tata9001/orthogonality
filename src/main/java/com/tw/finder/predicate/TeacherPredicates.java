package com.tw.finder.predicate;

import com.tw.finder.matcher.Matcher;
import com.tw.finder.po.Teacher;

/**
 * Created by yunwang on 1/18/16.
 */
public class TeacherPredicates {

    public static Predicate<Teacher> name(Matcher<String> m) {
        return s -> m.matches(s.getName());
    }

    public static Predicate<Teacher> age(Matcher<Integer> m) {
        return s -> m.matches(s.getAge());
    }

    public static Predicate<Teacher> male(Matcher<Boolean> m) {
        return s -> m.matches(s.isMale());
    }
}
