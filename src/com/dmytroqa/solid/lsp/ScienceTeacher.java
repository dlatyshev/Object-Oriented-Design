package com.dmytroqa.solid.lsp;

public class ScienceTeacher extends Teacher implements CourseInstructor {
    @Override
    public void teach() {
        System.out.println("Teaching Science...");
    }
}
