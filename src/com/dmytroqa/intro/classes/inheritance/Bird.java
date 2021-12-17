package com.dmytroqa.intro.classes.inheritance;

import com.dmytroqa.intro.classes.Gender;

public abstract class Bird extends Animal {

    public Bird(int age, Gender gender, double weight) {
        super(age, gender, weight);
    }
}
