package com.java.margarita.jt02.model;

import com.java.margarita.jt02.interfaces.Swimming;

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
