package com.java.margarita.jt02.model;

import com.java.margarita.jt02.interfaces.Running;
import com.java.margarita.jt02.interfaces.Walking;

public class Cat extends Animal implements Walking, Running {
    private int weight;

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

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.setWeight(weight);
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

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
