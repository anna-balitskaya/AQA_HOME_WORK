package Lesson_6;

public class Main {
    public static void main(String[] args){

        Dog dog = new Dog("Бобик", false);
        dog.run();
        dog.swim();
        dog.eat();
        Cat cat = new Cat("Мурзик", false);
        cat.run();
        cat.swim();
        cat.eat();
        Cat cat1 = new Cat("Рыжик", false);
        cat1.run();
        cat1.swim();
        cat1.eat();
        Cat cat2 = new Cat("Маркиз", false);
        cat2.run();
        cat2.swim();
        cat2.eat();

        //Plate plate = new Plate(40);

        System.out.println("Всего животных: " + (Lesson_6.Cat.getCountCat() + Lesson_6.Dog.getCountDog()));
        System.out.println("Всего котов: "+ Lesson_6.Cat.getCountCat());
        System.out.println("Всего собак: "+ Lesson_6.Dog.getCountDog());

    }
}

