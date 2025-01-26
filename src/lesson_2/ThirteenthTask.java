package lesson_2;
/*
Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть
[][],[][],[][],...,[][]
 */

public class ThirteenthTask {
    public static void main(String[] args) {
        int dimension = 10;
        int[][] array = new int[dimension][dimension];

        for (int i = 0; i < array.length; i++) {
            array[i][array.length - i - 1] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][i] = 1;
                System.out.print(array[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
    }
