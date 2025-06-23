package com.java.margarita.jt02.model;

import com.java.margarita.jt02.interfaces.Running;
import com.java.margarita.jt02.interfaces.Walking;

import java.util.logging.Logger;

public class Cat extends Animal implements Walking, Running {
    Logger logger = Logger.getLogger(getClass().getName());
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
        logger.info("The cat says meow");
    }

    @Override
    public void eat() {
        logger.info("Cat like to eat fish ");
    }

    @Override
    public void sleep() {
        logger.info("Zzzzz Cat is sleeping");
    }

    @Override
    public void run() {
        logger.info("Cat is running");
    }

    @Override
    public void walk() {
        logger.info("Cat is walking");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
