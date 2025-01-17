package com.java.margarita.jt02.model;

import com.java.margarita.jt02.interfaces.Flying;
import com.java.margarita.jt02.interfaces.Running;
import com.java.margarita.jt02.interfaces.Walking;

public class Dove extends Animal implements Walking, Running, Flying {
    public Dove() {
    }

    public Dove(String name, int age) {
        this.name = name;
        this.age = age;
        ;
    }

    public Dove(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public void say() {
        System.out.println("The dove says Guli guli");
    }

    @Override
    public void eat() {
        System.out.println("Dove like eat seeds");
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
