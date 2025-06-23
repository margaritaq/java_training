package com.java.margarita.jt02.model;

import com.java.margarita.jt02.interfaces.Swimming;

import java.util.logging.Logger;

public class Dolphin extends Animal implements Swimming {
    Logger logger = Logger.getLogger(getClass().getName());

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
        logger.info("The dolphin says Iiaa");
    }

    @Override
    public void eat() {
        logger.info("Dolphin like eat fish");
    }

    @Override
    public void sleep() {
        logger.info("Zzzzz Dolphin is sleeping");
    }

    @Override
    public void swim() {
        logger.info("Dolfin is swimming");
    }
}
