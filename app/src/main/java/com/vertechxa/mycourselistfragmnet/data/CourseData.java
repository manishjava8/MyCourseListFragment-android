package com.vertechxa.mycourselistfragmnet.data;

import java.util.ArrayList;
import java.util.List;

public class CourseData {

    private String[] courseNames = {"First Course", "Second Course", "Third Course", "Fourth Course", "Fifth Course", "Sixth Course", "Seventh Course"};

    public List<Course> courseList() {
        List<Course> list = new ArrayList<Course>();

        for (int i = 0; i < courseNames.length; i++) {
            Course course = new Course(courseNames[i], courseNames[i].replace(" ", "").toLowerCase());
            list.add(course);
        }

        return list;
    }
}
