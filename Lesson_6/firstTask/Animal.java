package Lesson_6.firstTask;

public abstract class Animal {
    protected String name;
    double distanceRun = 500;
    double distanceSwim = 10;

    public void run() {
        System.out.println();
    }

    public void swim() {

        System.out.println();
    }

    public Animal(String name) {
        this.name = name;
    }
}