package com.tw.finder;

import com.tw.finder.po.Student;

import java.util.ArrayList;

public class StudentFinder {

    public static Student findByAge(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAge() == 18) {
                return students.get(i);
            }
        }
        return null;
    }
}
