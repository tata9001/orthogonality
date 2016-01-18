package com.tw.finder.po;

/**
 * Created by yunwang on 1/13/16.
 */
public class Student extends Human {
    public Student(String name, int age, boolean male) {
        super(name, age, male);
    }

    public static Student create(String name, int age, boolean male) {
        return new Student(name, age, male);
    }
}
