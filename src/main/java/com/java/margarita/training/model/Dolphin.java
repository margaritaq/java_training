package com.java.margarita.training.model;

import com.java.margarita.training.abstracts.Animal;
import com.java.margarita.training.interfaces.Swimming;

public class Dolphin extends Animal implements Swimming {
    public Dolphin() {
    }

    public Dolphin(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dolphin(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public void say() {
        System.out.println("Iiaa");
    }

    @Override
    public void eat() {
        System.out.println("Dolphin like fish");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzz Dolphin is sleeping");
    }

    @Override
    public void swim() {
        System.out.println("Dolfin is swimming");
    }
}
