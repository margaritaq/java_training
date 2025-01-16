package com.java.margarita.training.model;

import com.java.margarita.training.interfaces.Running;
import com.java.margarita.training.interfaces.Walking;

public class Cat extends Animal implements Walking, Running {
    public Cat() {
    }

    public Cat(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public Cat(String name, int age, String color) {
        this.setName(name);
        this.setAge(age);
        this.setColor(color);
    }

    @Override
    public void say() {
        System.out.println("The cat says meow");
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
        System.out.println("Cat is walking");
    }
}
