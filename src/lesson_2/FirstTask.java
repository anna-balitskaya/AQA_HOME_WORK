package lesson_2;
/*
Создать метод printThreeWords, кторый при вызове печатает в столбец три слова:
Orange, Banana, Apple
*/

public class FirstTask {
    public static void main (String[] args) {
        printThreeWords("Orange\nBanana\nApple");
    }

    static void printThreeWords (String text) {
        System.out.println(text);
    }
}
