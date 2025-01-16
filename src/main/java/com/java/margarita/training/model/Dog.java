package com.java.margarita.training.model;

import com.java.margarita.training.interfaces.Running;
import com.java.margarita.training.interfaces.Swimming;
import com.java.margarita.training.interfaces.Walking;

public class Dog extends Animal implements Walking, Running, Swimming {
    public Dog() {
    }

    public Dog(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public Dog(String name, int age, String color) {
        this.setName(name);
        this.setAge(age);
        this.setColor(color);
    }

    @Override
    public void say() {
        System.out.println("The dog says Ham ham");
    }

    @Override
    public void eat() {
        System.out.println("Dog like bones");

    }

    @Override
    public void sleep() {
        System.out.println("Zzzzz Dog is sleeping");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }
}
