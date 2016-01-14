package com.tw.finder;

import com.tw.finder.po.Student;
import com.tw.finder.po.Teacher;
import com.tw.finder.predicate.StudentPredicate;
import com.tw.finder.predicate.TeacherPredicate;


public class TeacherFinder {

    public static Teacher find(Iterable<Teacher> teachers, TeacherPredicate p) {

        for (Teacher t : teachers) {
            if (p.test(t)) {
                return t;
            }
        }
        return null;
    }

}
