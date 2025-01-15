package com.java.margarita.training.model;

import com.java.margarita.training.abstracts.Animal;
import com.java.margarita.training.interfaces.Running;
import com.java.margarita.training.interfaces.Swimming;
import com.java.margarita.training.interfaces.Walking;

public class Crab extends Animal implements Walking, Running, Swimming {
    public Crab() {
    }

    public Crab(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public Crab(String name, int age, String color) {
        this.setName(name);
        this.setAge(age);
        this.setColor(color);
    }

    @Override
    public void say() {
        System.out.println("Crab can't speak ");
    }

    @Override
    public void eat() {
        System.out.println("Crab like INVERTEBRATES");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzzzz Crab is sleeping");
    }

    @Override
    public void run() {
        System.out.println("Crab is running");
    }

    @Override
    public void swim() {
        System.out.println("Crab is swimming");
    }

    @Override
    public void walk() {
        System.out.println("Crab is walking");
    }
}
