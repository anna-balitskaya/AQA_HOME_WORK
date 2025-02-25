package Lesson_6_2;

public class Cat extends Animal{
    int satiety;
    private static int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;
        this.satiety = 0;
    }

    @Override
    public void run(int length) {
        if (length > 200) {
            System.out.println(name + " не может пробежать более 200 м");
        } else if (length <= 0) {
            System.out.println(name + " не может пробежать менее " + length + " м.");
        } else {
            System.out.println(name + " пробежал " + length + " м.");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Кот " + name + " не умеет плавать");
    }

    public static int catCount() {
        return catCount;
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
}
