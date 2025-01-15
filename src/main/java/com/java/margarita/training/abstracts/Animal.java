package com.java.margarita.training.abstracts;

public abstract class Animal {
    private String name;
    private int age;
    private String color;

    public abstract void say();

    public abstract void eat();

    public abstract void sleep();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
