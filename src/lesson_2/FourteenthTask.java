package lesson_2;

/*
Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающих одномерный массив типа int
длинной len, каждая ячейка которого равна initialValue
 */

public class FourteenthTask {
    public static void main(String[] args) {
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = 100; //инициализируем
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}