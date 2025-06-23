package com.java.margarita.jt02.model;

import com.java.margarita.jt02.interfaces.Flying;
import com.java.margarita.jt02.interfaces.Running;
import com.java.margarita.jt02.interfaces.Swimming;
import com.java.margarita.jt02.interfaces.Walking;

import java.util.logging.Logger;

public class Duck extends Animal implements Walking, Running, Swimming, Flying {
    Logger logger = Logger.getLogger(getClass().getName());

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
        logger.info("The duck says Mac Mac");
    }

    @Override
    public void eat() {
        logger.info("Duck like eat seeds and grass");
    }

    @Override
    public void sleep() {
        logger.info("Zzz Duck is sleeping");
    }

    @Override
    public void fly() {
        logger.info("The duck is flying");
    }

    @Override
    public void run() {
        logger.info("Duck is running");
    }

    @Override
    public void swim() {
        logger.info("Duck is swimming");
    }

    @Override
    public void walk() {
        logger.info("Duck is walking");
    }
}
