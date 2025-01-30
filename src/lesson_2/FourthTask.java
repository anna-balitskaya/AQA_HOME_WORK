package lesson_2;
/*
Создать метод compareNumbers, в теле которого обьявить две int переменные a и b. Если a больше или равно b,
то необходимо вывести в консоль сообщение "a >= b", в противном случае "a < b"
 */

public class FourthTask {
    public static void main (String[] args) {
        int a = 4;
        int b = 4;

        compareNumbers(a, b);
    }

    static void compareNumbers (int x, int y) {
        if (x >= y)
        System.out.println("a >= b");
        else System.out.println("a < b");

    }
}
