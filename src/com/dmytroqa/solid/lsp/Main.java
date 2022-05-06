package com.dmytroqa.solid.lsp;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<CourseInstructor> teachers = List.of(new EnglishTeacher(), new MathTeacher(), new ScienceTeacher());
        teachers.forEach(CourseInstructor::teach);
    }
}
