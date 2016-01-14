package com.tw.finder;

import com.tw.finder.po.Student;

import java.util.ArrayList;

public class StudentFinder {

    public static Student findByAge(ArrayList<Student> students) {

        for (Student student : students) {
            if (student.getAge() == 18) {
                return student;
            }
        }
        return null;
    }

    public static Student findByName(ArrayList<Student> students) {

        for (Student student : students) {
            if (student.getName().equals("wy")) {
                return student;
            }
        }
        return null;
    }
}
