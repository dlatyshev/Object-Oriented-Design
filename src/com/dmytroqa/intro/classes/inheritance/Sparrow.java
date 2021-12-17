package com.dmytroqa.intro.classes.inheritance;

import com.dmytroqa.intro.classes.Gender;
import com.dmytroqa.intro.classes.interfaces.Flyable;

public class Sparrow extends Bird implements Flyable {

    public Sparrow(int age, Gender gender, double weight) {
        super(age, gender, weight);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying well...");
    }

    @Override
    public void move() {
        System.out.println("Sparrow is moving...");
        fly();
    }
}
