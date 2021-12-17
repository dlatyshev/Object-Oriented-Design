package com.dmytroqa.intro.classes.inheritance;

import com.dmytroqa.intro.classes.Gender;

public class Chicken extends Bird {

    public Chicken(int age, Gender gender, double weight) {
        super(age, gender, weight);
    }

    @Override
    public void move() {
        System.out.println("Chicken is moving...");
    }
}
