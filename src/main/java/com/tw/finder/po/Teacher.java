package com.tw.finder.po;

/**
 * Created by yunwang on 1/13/16.
 */
public class Teacher {
    private String name;
    private int age;
    private boolean male;

    public Teacher(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return male;
    }

    public String getName() {
        return name;
    }

    public static Teacher create(String name, int age, boolean male) {
        return new Teacher(name, age, male);
    }
}
