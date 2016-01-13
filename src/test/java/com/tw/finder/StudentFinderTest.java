package com.tw.finder;

import com.google.common.collect.Lists;
import com.tw.finder.po.Student;
import org.junit.Before;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

/**
 * Created by yunwang on 1/13/16.
 */
public class StudentFinderTest {

    private ArrayList<Student> students;

    @Before
    public void setUp() throws Exception {
        students = Lists.newArrayList();
        students.add(Student.create("wy", 19, true));
        students.add(Student.create("xq", 17, true));
        students.add(Student.create("ym", 17, false));
        students.add(Student.create("fd", 18, true));
        students.add(Student.create("zx", 20, true));
    }

    @Test
    public void testFindByAge() throws Exception {
        assertThat(StudentFinder.findByAge(students), notNullValue());
    }
}