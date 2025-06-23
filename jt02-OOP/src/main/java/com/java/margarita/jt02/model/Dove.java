package com.java.margarita.jt02.model;

import com.java.margarita.jt02.interfaces.Flying;
import com.java.margarita.jt02.interfaces.Running;
import com.java.margarita.jt02.interfaces.Walking;

import java.util.logging.Logger;

public class Dove extends Animal implements Walking, Running, Flying {
    Logger logger = Logger.getLogger(getClass().getName());

    public Dove() {
    }

    public Dove(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Dove(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public void say() {
        logger.info("The dove says Guli guli");
    }

    @Override
    public void eat() {
        logger.info("Dove like eat seeds");
    }

    @Override
    public void sleep() {
        logger.info("Zzzz Dove is sleeping");
    }

    @Override
    public void fly() {
        logger.info("The dove is flying");
    }

    @Override
    public void run() {
        logger.info("Dove is running");
    }

    @Override
    public void walk() {
        logger.info("Dove is walking");
    }
}
