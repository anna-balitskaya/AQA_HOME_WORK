package Lesson_6;

public abstract class Animal {
    protected String name;
    protected boolean fullness;

    double distanceRun = 500;
    double distanceSwim = 10;


    public void eat() {
        System.out.println();
    }

    public void run() {
        System.out.println();
    }

    public void swim() {

        System.out.println();
    }

    public Animal(String name) {
        this.name = name;
        this.fullness = false;
    }
}