package Lesson_6.firstTask;

public class Main {
    public static void main(String[] args){

        Dog dog = new Dog("Бобик");
        dog.run();
        dog.swim();

        Cat[] cats = new Cat[3];
                cats[0] = new Cat("Мурзик");
                cats[0].run();
                cats[0].swim();
                cats[1] = new Cat("Рыжик");
                cats[1].run();
                cats[1].swim();
                cats[2] = new Cat("Маркиз");
                cats[2].run();
                cats[2].swim();

        Plate plate = new Plate(10);

        for (Cat cat : cats) {
            cat.eatFromPlate(plate, 5);
        }

        plate.addFood(10);

        System.out.println("Всего животных: " + (Cat.getCountCat() + Dog.getCountDog()));
        System.out.println("Всего котов: "+ Cat.getCountCat());
        System.out.println("Всего собак: "+ Dog.getCountDog());


    }
}

