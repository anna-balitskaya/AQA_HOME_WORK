package Lesson_6.firstTask;

public class Plate {
    private int plateWithFood;

    public Plate(int plate) {
        this.plateWithFood = plate;
    }

    public void reduceAmount(int amount) {
        if (amount <= plateWithFood) {
            plateWithFood -= amount;
        } else {
            System.out.println("В тарелке не осталось еды");
        }

    }

    public int getFoodAmount() {
        return plateWithFood;
    }

    public void addFood (int food) {
        System.out.println("В тарелку добавлено " + food + " еды");
        plateWithFood = plateWithFood + food;
    }
}
