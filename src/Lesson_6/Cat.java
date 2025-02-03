package Lesson_6;

public class Cat extends Animal {
    static int countCat = 0;
    public int lenght;

    public Cat(String name, boolean fullness) {
        super(name);
        countCat++;
    }


    @Override
    public void run() {
        if (distanceRun > 200) {
            System.out.println(name + " не может пробежать более 200 м");
        } else if (distanceRun <= 0) {
            System.out.println(name + " не может пробежать менее " + distanceRun + " м.");
        } else {
            System.out.println(name + " пробежал " + distanceRun + " м.");
        }
    }

    @Override
    public void swim() {
        System.out.println("Кот " + name + " не умеет плавать");
    }

    @Override
    public void eat() {
        super.eat();
    }

    static int getCountCat() {
        return countCat;
    }
}
