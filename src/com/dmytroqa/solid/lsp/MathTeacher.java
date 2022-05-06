package com.dmytroqa.solid.lsp;

public class MathTeacher extends Teacher implements CourseInstructor {
    @Override
    public void teach() {
        System.out.println("Teaching Math...");
    }
}
