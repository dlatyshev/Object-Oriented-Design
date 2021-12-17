package com.dmytroqa.intro.classes.inheritance;

import com.dmytroqa.intro.classes.Gender;

public class Zoo {

    public static void main(String[] args) {

        Bird chicken = new Chicken(1, Gender.MALE, 2);
        chicken.eat();
        chicken.sleep();

        Sparrow sparrow = new Sparrow(1, Gender.MALE, .2);
        sparrow.fly();


        Fish fish = new Fish(1, 2);
        fish.swim();
    }
}
