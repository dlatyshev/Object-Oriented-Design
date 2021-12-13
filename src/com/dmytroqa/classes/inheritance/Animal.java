package com.dmytroqa.classes.inheritance;

import com.dmytroqa.classes.Gender;

public abstract class Animal {

    int age;
    Gender gender;
    double weight;

    public Animal(int age, Gender gender, double weight) {
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("The animal is eating...");
    }

    public void sleep() {
        System.out.println("The animal is sleeping...");
    }

    public abstract void move();
}
