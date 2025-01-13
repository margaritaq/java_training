package task02.com;

import task02.*;

public class Menagerie {
    public static void main(String[] args){
        Cat cat1= new Cat();
        Cat cat2= new Cat("Busea",2);
        Cat cat3= new Cat("Bob",1, "orange");

        Dog dog1=new Dog();
        Dog dog2=new Dog("Bosic",5);
        Dog dog3=new Dog("Lucky",2,"white");

        Crab crab= new Crab();

        Dolphin dolphin= new Dolphin("Star", 1);

        Dove dove= new Dove("Kesha",1);

        Duck duck =new Duck("Veronica",1,"grey");

        cat3.eat();
        dog3.run();
        crab.say();
        dolphin.swim();
        cat2.walk();
        duck.walk();
        dove.sleep();

    }
}
