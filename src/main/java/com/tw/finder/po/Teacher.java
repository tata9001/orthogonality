package com.tw.finder.po;

/**
 * Created by yunwang on 1/13/16.
 */
public class Teacher extends Human {
    public Teacher(String name, int age, boolean male) {
        super(name, age, male);
    }

    public static Teacher create(String name, int age, boolean male) {
        return new Teacher(name, age, male);
    }
}
