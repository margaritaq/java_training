package com.java.margarita.training.model;

import com.java.margarita.training.interfaces.Swimming;

public class Dolphin extends Animal implements Swimming {
    public Dolphin() {
    }

    public Dolphin(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public Dolphin(String name, int age, String color) {
        this.setName(name);
        this.setAge(age);
        this.setColor(color);
    }

    @Override
    public void say() {
        System.out.println("The dolphin says Iiaa");
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
