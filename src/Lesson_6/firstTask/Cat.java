package Lesson_6.firstTask;

public class Cat extends Animal {
    static int countCat = 0;

    int satiety;

    public Cat(String name) {
        super(name);
        countCat++;
        this.satiety = 0;
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

        public boolean eatFromPlate(Plate plate, int amount) {
            if (plate.getFoodAmount() >= amount) {
                plate.reduceAmount(amount);
                satiety = satiety + amount;
                System.out.println("Кот " + name + " поел," + " сытость: " + satiety);
                return true;
            } else {
                System.out.println("В миске недостаточно еды для кота " + name + " сытость: " + satiety);
                return false;
            }
        }

    static int getCountCat() {
        return countCat;
    }

}
