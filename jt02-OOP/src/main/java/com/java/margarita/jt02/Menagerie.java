package com.java.margarita.jt02;

import com.java.margarita.jt02.interfaces.Walking;
import com.java.margarita.jt02.model.*;

import java.util.List;

public class Menagerie {

    public static void main(String[] args) {
        Cat kity = new Cat();
        Cat busea = new Cat("Busea", 2);
        Cat bob = new Cat("Bob", 1, "orange");
        bob.setKg(5);
        kity.setKg(2);

        Dog lucky = new Dog("Lucky", 2, "white");
        Crab crab = new Crab();
        Dolphin dolphin = new Dolphin("Star", 1);
        Dove dove = new Dove("Kesha", 1);
        Duck duck = new Duck("Veronica", 1, "grey");

        List<Animal> animals = List.of(kity, lucky, crab, dolphin, duck, dove);
        TheWildWorld theWildWorld = new TheWildWorld();
        theWildWorld.printAnimalsEat(animals);
        theWildWorld.printAnimalsSay(animals);
        theWildWorld.printAnimalsSleep(animals);

        List<Walking> canWalk = List.of(kity, lucky, crab, duck, dove);
        canWalk.forEach(Walking::walk);
        theWildWorld.printFlayingAnimals(animals);
    }
}