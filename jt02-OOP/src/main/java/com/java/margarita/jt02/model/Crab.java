package com.java.margarita.jt02.model;

import com.java.margarita.jt02.interfaces.Running;
import com.java.margarita.jt02.interfaces.Swimming;
import com.java.margarita.jt02.interfaces.Walking;

import java.util.logging.Logger;

public class Crab extends Animal implements Walking, Running, Swimming {
    Logger logger = Logger.getLogger(getClass().getName());

    public Crab() {
    }

    public Crab(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Crab(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public void say() {
        logger.info("Crab can't speak ");
    }

    @Override
    public void eat() {
        logger.info("Crab like eat INVERTEBRATES");
    }

    @Override
    public void sleep() {
        logger.info("Zzzzzzz Crab is sleeping");
    }

    @Override
    public void run() {
        logger.info("Crab is running");
    }

    @Override
    public void swim() {
        logger.info("Crab is swimming");
    }

    @Override
    public void walk() {
        logger.info("Crab is walking");
    }
}
