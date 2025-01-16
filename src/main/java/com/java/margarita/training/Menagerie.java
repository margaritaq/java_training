package com.java.margarita.training;

import com.java.margarita.training.model.Animal;
import com.java.margarita.training.interfaces.Walking;
import com.java.margarita.training.model.*;

import java.util.ArrayList;

public class Menagerie {
    ArrayList<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {
        Cat kity = new Cat();
        Cat busea = new Cat("Busea", 2);
        Cat bob = new Cat("Bob", 1, "orange");

        Dog lucky = new Dog("Lucky", 2, "white");

        Crab crab = new Crab();

        Dolphin dolphin = new Dolphin("Star", 1);

        Dove dove = new Dove("Kesha", 1);

        Duck duck = new Duck("Veronica", 1, "grey");
        System.out.println("Hi! I am a duck. My name is " + duck.getName() + ". I'm " + duck.getAge() + " years old. I have " + duck.getColor() + " color.");

        Menagerie menagerie = new Menagerie();
        menagerie.addAnimalToList(lucky);
        menagerie.addAnimalToList(kity);
        menagerie.addAnimalToList(crab);
        menagerie.addAnimalToList(dolphin);
        menagerie.addAnimalToList(dove);

        System.out.println("-------------");
        menagerie.printAnimalsEat(menagerie.animals);
        System.out.println("-------------");
        menagerie.printAnimalsSay(menagerie.animals);
        System.out.println("-------------");
        menagerie.printAnimalsSleep(menagerie.animals);
        System.out.println("-------------");

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

    public ArrayList<Animal> addAnimalToList(Animal animal) {
        animals.add(animal);
        return animals;
    }

    public void printAnimalsEat(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }

    public void printAnimalsSay(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            animal.say();
        }
    }

    public void printAnimalsSleep(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            animal.sleep();
        }
    }

}
