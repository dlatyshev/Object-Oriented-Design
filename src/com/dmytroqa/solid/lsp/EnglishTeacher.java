package com.dmytroqa.solid.lsp;

public class EnglishTeacher extends Teacher implements CourseInstructor {
    @Override
    public void teach() {
        System.out.println("Teaching English...");
    }
}
