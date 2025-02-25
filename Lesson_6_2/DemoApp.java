package Lesson_6_2;

public class DemoApp {
    public static void main(String[] args) {
        Plate plate = new Plate(10);
        Cat[] cats = {
                new Cat("Мурзик"),
                new Cat("Рыжик"),
                new Cat("Маркиз")
        };


        System.out.println("Всего котов: " + Cat.catCount());

        for (Cat cat : cats) {
            cat.eatFromPlate(plate, 5);
        }

        plate.addFood(10);

       Dog dog1 = new Dog("Бобик");
       dog1.run(200);
       dog1.swim(50);
       System.out.println("Всего собак: " + Dog.dogCount());
    }
}
