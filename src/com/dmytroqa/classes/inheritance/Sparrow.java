package com.dmytroqa.classes.inheritance;

import com.dmytroqa.classes.Gender;
import com.dmytroqa.interfaces.Flyable;

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
