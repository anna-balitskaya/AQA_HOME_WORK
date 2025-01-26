package lesson_2;
/*
Задать пустой целочисленный массив длинной 100. С помощью цикла заполнить его значениями 12345678...100
*/

public class EleventhTask {
    public static void main(String[] args) {
        int[] array = new int[101];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
    }
}
