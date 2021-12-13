package com.dmytroqa.classes.inheritance;

import com.dmytroqa.classes.Gender;
import com.dmytroqa.classes.inheritance.Animal;
import com.dmytroqa.classes.inheritance.Bird;
import com.dmytroqa.classes.inheritance.Fish;

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
