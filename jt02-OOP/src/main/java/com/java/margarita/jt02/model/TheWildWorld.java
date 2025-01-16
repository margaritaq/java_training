package com.java.margarita.jt02.model;

import com.java.margarita.jt02.interfaces.Flying;

import java.util.List;

public class TheWildWorld {

    public void printAnimalsEat(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }

    public void printAnimalsSay(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.say();
        }
    }

    public void printAnimalsSleep(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.sleep();
        }
    }

    public void printFlayingAnimals(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Flying) {
                ((Flying) animal).fly();
            }
        }
    }
}
