package com.dmytroqa.classes;

public class Human {

    private String name;
    private int age;
    private int heightInInches;
    String eyeColor;

    public Human() {

    }

    public Human(String name, int age, int heightInInches, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }


    public void speak() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I'm " + heightInInches + " inches tall.");
        System.out.println("I'm " + age + " years old.");
        System.out.println("I have " + eyeColor + " eyes color.");
    }

    public void eat() {
        System.out.println("I'm eating...Nom nom nom.");
    }

    public void walk() {
        System.out.println("I'm walking...");
    }

    public void talk() {
        System.out.println("I'm talking...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}
