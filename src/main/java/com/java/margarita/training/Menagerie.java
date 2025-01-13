package com.java.margarita.training;

import com.java.margarita.training.abstracts.Animal;
import com.java.margarita.training.interfaces.Flying;
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
        ArrayList<Flying> canFly= new ArrayList<>();
        canFly.add(duck);
        canFly.add(dove);
        System.out.println("------------------");
        for(Flying flys:canFly){
            flys.fly();
        }


    }
}
