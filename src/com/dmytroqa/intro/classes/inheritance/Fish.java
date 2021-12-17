package com.dmytroqa.intro.classes.inheritance;

import com.dmytroqa.intro.classes.Gender;

public class Fish extends Animal {

    public Fish(int age, int weight) {
        super(age, Gender.NONE, weight);
    }

    @Override
    public void move() {
        this.swim();
    }

    @Override
    public void eat() {
        System.out.println("The fish is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("The fish is sleeping...");
    }

    public void swim() {
        System.out.println("Swimming...");
    }
}
