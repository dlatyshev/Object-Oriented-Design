package com.dmytroqa.classes;

public class Zoo {

    public static void main(String[] args) {
        Animal animal = new Animal(2, Gender.MALE, 25);
        animal.eat();

        Bird bird = new Bird();
        bird.fly();

        Fish fish = new Fish();
        fish.swim();
    }
}
