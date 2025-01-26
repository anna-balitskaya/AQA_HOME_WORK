package lesson_2;
/*
Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [1,1,0,0,1,0,1,1,0,0]
С помощью цикла и условия заменить 0 на 1,1 на 0
 */

public class TenthTask {
    public static void main(String[] args) {
        System.out.print("Before replacement:  ");
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
            if (array[i] == 0)
                array[i] = 1;
            else array[i] = 0;
        }
        System.out.print("\nAfter replacement :  ");
        for (int i : array) {
           System.out.print(i + ",");
        }
    }
}
