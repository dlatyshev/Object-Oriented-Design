package com.dmytroqa.classes;

public class Animal {

    int age;
    Gender gender;
    int weight;

    public Animal(int age, Gender gender, int weight) {
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
}
