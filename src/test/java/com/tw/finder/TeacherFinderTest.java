package com.tw.finder;

import com.google.common.collect.Lists;
import com.tw.finder.po.Teacher;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static com.tw.finder.TeacherFinder.find;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class TeacherFinderTest {

    private ArrayList<Teacher> teachers;

    @Before
    public void setUp() throws Exception {
        teachers = Lists.newArrayList();
        teachers.add(Teacher.create("wy", 19, true));
        teachers.add(Teacher.create("xq", 17, true));
        teachers.add(Teacher.create("ym", 17, false));
        teachers.add(Teacher.create("fd", 18, true));
        teachers.add(Teacher.create("zx", 20, true));
    }

    @Test
    public void testFindBySex() throws Exception {
        assertThat(find(teachers, t -> !t.isMale()), notNullValue());
    }

}