package com.tw.finder;

import com.google.common.collect.Lists;
import com.tw.finder.po.Human;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.function.Predicate;

import static com.tw.finder.Finder.find;
import static com.tw.finder.predicate.HumanPredicates.*;
import static java.util.function.Predicate.isEqual;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by yunwang on 1/13/16.
 */
public class FinderTest {

    private ArrayList<Human> teachers;

    private ArrayList<Human> students;

    @Before
    public void setUp() throws Exception {
        students = Lists.newArrayList();
        students.add(Human.student("wy", 19, true));
        students.add(Human.student("xq", 17, true));
        students.add(Human.student("ym", 17, false));
        students.add(Human.student("fd", 18, true));
        students.add(Human.student("zx", 20, true));


        teachers = Lists.newArrayList();
        teachers.add(Human.teacher("wy", 19, true));
        teachers.add(Human.teacher("xq", 17, true));
        teachers.add(Human.teacher("ym", 17, false));
        teachers.add(Human.teacher("fd", 18, true));
        teachers.add(Human.teacher("zx", 20, true));
    }

    @Test
    public void testFindBySex() throws Exception {
        assertThat(find(teachers, male(isEqual(true))).isPresent(), is(true));
    }


    @Test
    public void testFindByEqAge() throws Exception {
        assertThat(find(students, age(isEqual(18))).isPresent(), is(true));
    }

    @Test
    public void testFindByEqAgeAndMale() throws Exception {
        assertThat(find(students, age(isEqual(17)).and(male(isEqual(false)))).isPresent(), is(true));
    }

    @Test
    public void testFindByNeAge() throws Exception {
        Predicate<Integer> equal = isEqual(18);
        assertThat(find(students, age(equal.negate())).isPresent(), is(true));
    }

    @Test
    public void testFindByName() throws Exception {
        assertThat(find(students, name(isEqual("wy"))).isPresent(), is(true));
    }

}