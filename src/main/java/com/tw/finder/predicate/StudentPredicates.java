package com.tw.finder.predicate;

import com.tw.finder.matcher.Matcher;
import com.tw.finder.po.Student;

/**
 * Created by yunwang on 1/18/16.
 */
public class StudentPredicates {

    public static Predicate<Student> name(Matcher<String> m) {
        return s -> m.matches(s.getName());
    }

    public static Predicate<Student> age(Matcher<Integer> m) {
        return s -> m.matches(s.getAge());
    }

    public static Predicate<Student> male(Matcher<Boolean> m) {
        return s -> m.matches(s.isMale());
    }
}
