package com.tw.finder.predicate;

import com.tw.finder.po.Student;

/**
 * Created by yunwang on 1/18/16.
 */
public class StudentPredicates {

    public static Predicate<Student> name(String wy) {
        return s -> s.getName().equals(wy);
    }

    public static Predicate<Student> age(int age) {
        return s -> s.getAge() == age;
    }

    public static Predicate<Student> male() {
        return s -> s.isMale();
    }
}
