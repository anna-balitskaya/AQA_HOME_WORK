package lesson_2;
/*
Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
положительное ли число передали или отрицательное. Значение: ноль считаем положительным числом
 */

public class SixthTask {
    public static void main(String[] args) {
        int a = 1;

        number(a);
    }

        static void number(int x){
        if (x >= 0) {
            System.out.println("Вы передали положительное число!");
        } else if (x < 0) {
            System.out.println("Вы передали отрицательное число!");
        }
    }
}