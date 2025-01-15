package com.java.margarita.training;

import com.java.margarita.training.abstracts.Animal;
import com.java.margarita.training.interfaces.Flying;
import com.java.margarita.training.interfaces.Walking;
import com.java.margarita.training.model.*;

import java.util.ArrayList;

public class Menagerie {
    public static void main(String[] args) {
        Cat kity = new Cat();
        Cat busea = new Cat("Busea", 2);
        Cat bob = new Cat("Bob", 1, "orange");

        Dog lucky = new Dog("Lucky", 2, "white");

        Crab crab = new Crab();

        Dolphin dolphin = new Dolphin("Star", 1);

        Dove dove = new Dove("Kesha", 1);

        Duck duck = new Duck("Veronica", 1, "grey");

        bob.eat();
        lucky.run();
        crab.say();
        dolphin.swim();
        busea.walk();
        duck.walk();
        dove.sleep();
        System.out.println("Hi! I am a duck. My name is " + duck.getName() + ". I'm " + duck.getAge() + " years old. I have " + duck.getColor() + " color.");
        duck.getName();

        ArrayList<Animal> animale = new ArrayList<>();
        animale.add(kity);
        animale.add(lucky);
        animale.add(crab);
        animale.add(dolphin);
        animale.add(dove);
        animale.add(duck);
        System.out.println("-----------------");

        for (Animal animal : animale) {
            animal.eat();
        }
        ArrayList<Walking> canWalk = new ArrayList<>();
        canWalk.add(kity);
        canWalk.add(lucky);
        canWalk.add(crab);
        canWalk.add(duck);
        canWalk.add(dove);
        System.out.println("------------------");
        for (Walking walks : canWalk) {
            walks.walk();
        }


    }
}
