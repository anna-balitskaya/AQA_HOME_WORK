package lesson_2;
/*
Создать метод printColor, в теле которого задать int переменную value.
Если value меньше 0 (0 включительно), то должно выводиться сообщение "Красный",
если value от 0 (0 исключение) до 100 (100 включительно), то должно выводиться сообщение "Желтый",
если value больше 100 (100 исключительно) - "Зеленый"
*/

public class ThirdTask {
    public static void main(String[] args) {
        int value = 100;

        printColor(value);
    }
        static void printColor(int x) {
            int z = x;

            if (z <= 0)
                System.out.println("Красный");
            else if (z <= 100) System.out.println("Желтый");
            else if (z > 100) System.out.println("Зеленый");
    }
}