package com.tw.finder.predicate;

import com.tw.finder.po.Student;

/**
 * Created by yunwang on 1/14/16.
 */
public class NameStudentPredicate implements StudentPredicate {
    private String name;

    public NameStudentPredicate(String name) {
        this.name = name;
    }

    public boolean test(Student s) {
        return name.equals(s.getName());
    }
}
