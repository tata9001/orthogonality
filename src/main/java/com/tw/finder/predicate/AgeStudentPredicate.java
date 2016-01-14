package com.tw.finder.predicate;

import com.tw.finder.po.Student;

/**
 * Created by yunwang on 1/14/16.
 */
public class AgeStudentPredicate implements StudentPredicate {
    private int age;

    public AgeStudentPredicate(int age) {
        this.age = age;
    }

    public boolean test(Student s) {
        return age == s.getAge();
    }
}
