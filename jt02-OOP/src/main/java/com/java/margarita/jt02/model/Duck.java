package com.java.margarita.jt02.model;

import com.java.margarita.jt02.interfaces.Flying;
import com.java.margarita.jt02.interfaces.Running;
import com.java.margarita.jt02.interfaces.Swimming;
import com.java.margarita.jt02.interfaces.Walking;

public class Duck extends Animal implements Walking, Running, Swimming, Flying {
    public Duck() {
    }

    public Duck(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Duck(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public void say() {
        System.out.println("The duck says Mac Mac");
    }

    @Override
    public void eat() {
        System.out.println("Duck like eat seeds and grass");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz Duck is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("The duck is flying");
    }

    @Override
    public void run() {
        System.out.println("Duck is running");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

    @Override
    public void walk() {
        System.out.println("Duck is walking");
    }
}
