package com.tw.finder.predicate;

import com.tw.finder.po.Teacher;

/**
 * Created by yunwang on 1/18/16.
 */
public class TeacherPredicates {

    public static Predicate<Teacher> name(String wy) {
        return s -> s.getName().equals(wy);
    }

    public static Predicate<Teacher> age(int age) {
        return s -> s.getAge() == age;
    }

    public static Predicate<Teacher> male() {
        return s -> !s.isMale();
    }
}
