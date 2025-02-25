package Lesson_6.firstTask;

public class Dog extends Animal {
    static int countDog = 0;
    public Dog (String name){
        super(name);
        countDog++;

    }


    @Override
    public void swim() {
        if (distanceSwim > 10) {
            System.out.println(name + " не может проплыть более 10 м.");
        } else if (distanceSwim <= 0) {
            System.out.println(name + " не может проплыть менее " + distanceSwim + " м.");
        } else {
            System.out.println(name + " проплыл " + distanceSwim + " м.");
        }
    }

    @Override
    public void run() {
        if (distanceRun > 500) {
            System.out.println(name + " не может пробежать более 500 м");
        } else if (distanceRun <= 0) {
            System.out.println(name + " не может пробежать менее " + distanceRun + " м.");
        } else {
            System.out.println(name + " пробежал " + distanceRun + " м.");
        }
    }

    static int getCountDog() {
        return countDog;
    }
}
