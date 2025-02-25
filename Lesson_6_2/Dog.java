package Lesson_6_2;

public class Dog extends Animal{
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run (int length) {
        if (length > 500) {
            System.out.println(name + " не может пробежать более 500 м");
        } else if (length <= 0) {
            System.out.println(name + " не может пробежать менее " + length + " м.");
        } else {
            System.out.println(name + " пробежал " + length + " м.");
        }
    }

    @Override
    public void swim (int length) {
        if (length > 10) {
            System.out.println(name + " не может проплыть более 10 м.");
        } else if (length <= 0) {
            System.out.println(name + " не может проплыть менее " + length + " м.");
        } else {
            System.out.println(name + " проплыл " + length + " м.");
        }

    }

    public static int dogCount() {
        return dogCount;
    }
}
