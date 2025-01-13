package com.java.margarita.training.model;

import com.java.margarita.training.abstracts.Animal;
import com.java.margarita.training.interfaces.Running;
import com.java.margarita.training.interfaces.Walking;

public class Cat extends Animal implements Walking, Running {
    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public void say() {
        System.out.println("Meau");
    }

    @Override
    public void eat() {
        System.out.println("Cat like to eat fish ");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzz Cat is sleeping");
    }

    @Override
    public void run() {
        System.out.println("Cat is running");
    }

    @Override
    public void walk() {
        System.out.println("Cat walking");
    }
}
