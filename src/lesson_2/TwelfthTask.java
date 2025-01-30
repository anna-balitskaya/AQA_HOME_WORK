package lesson_2;
/*
Задать массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1] пройти по нему циклом, и числа меньше 6 умножить на 2
 */

public class TwelfthTask {
    public static void main(String[] args) {
        System.out.print("Before replacement:\n");
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
            if (array[i] < 6)
                array[i] = array[i] * 2;
        }
        System.out.print("\nAfter replacement:\n");
        for (int i : array) {
            System.out.print(i + ",");
        }
    }
}