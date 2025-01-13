package com.java.margarita.training.model;

import com.java.margarita.training.abstracts.Animal;
import com.java.margarita.training.interfaces.Flying;
import com.java.margarita.training.interfaces.Running;
import com.java.margarita.training.interfaces.Walking;

public class Dove extends Animal implements Walking, Running, Flying {
    public Dove() {
    }

    public Dove(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dove(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public void say() {
        System.out.println("Guli guli");
    }

    @Override
    public void eat() {
        System.out.println("Dove like seeds");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzz Dove is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("The dove is flying");
    }

    @Override
    public void run() {
        System.out.println("Dove is running");
    }

    @Override
    public void walk() {
        System.out.println("Dove is walking");
    }
}
