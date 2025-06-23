package com.java.margarita.jt02.model;

import com.java.margarita.jt02.interfaces.Running;
import com.java.margarita.jt02.interfaces.Swimming;
import com.java.margarita.jt02.interfaces.Walking;

import java.util.logging.Logger;

public class Dog extends Animal implements Walking, Running, Swimming {
    Logger logger = Logger.getLogger(getClass().getName());

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public void say() {
        logger.info("The dog says Ham ham");
    }

    @Override
    public void eat() {
        logger.info("Dog like eat bones");
    }

    @Override
    public void sleep() {
        logger.info("Zzzzz Dog is sleeping");
    }

    @Override
    public void run() {
        logger.info("Dog is running");
    }

    @Override
    public void swim() {
        logger.info("Dog is swimming");
    }

    @Override
    public void walk() {
        logger.info("Dog is walking");
    }
}
