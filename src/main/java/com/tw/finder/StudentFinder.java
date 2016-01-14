package com.tw.finder;

import com.tw.finder.po.Student;
import com.tw.finder.predicate.StudentPredicate;

import java.util.ArrayList;

public class StudentFinder {

    public static Student find(ArrayList<Student> students, StudentPredicate p) {

        for (Student student : students) {
            if (p.test(student)) {
                return student;
            }
        }
        return null;
    }

}
