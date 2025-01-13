package task02;

public class Dog extends Animal implements Walking,Running,Swimming{
    public Dog(){
    }
    public Dog(String name, int age){
        this.name=name;
        this.age=age;
    }
    public Dog(String name, int age, String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    @Override
    public void say() {
        System.out.println("Ham ham");
    }

    @Override
    public void eat() {
        System.out.println("Dog like bones");

    }

    @Override
    public void sleep() {
        System.out.println("Zzzzz Dog is sleeping");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }
}
