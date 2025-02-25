package Lesson_10;
/*
Написать метод, на вход которого подается двумерный строковый массив размером 4х4. При подаче массива другого размера
необходимо бросить исключение MyArraySizeException.
Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе
массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение
MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
и вывести результат расчета.
 */

public class Main {
    public static void main(String[] args) {
        String[][] squareMatrix = {
                {"1", "3", "5", "7"},
                {"2", "4", "6lfhhg", "8"},
                {"9", "0", "5", "7"},
                {"2", "4", "6", "8"}
        };
        try {
            matrix(squareMatrix);
        } catch (MyArraySizeException e) {
            System.out.println("Некорректный размер массива. Массив должен быть: 4х4 ");
        }
        // }
        catch (MyArrayDataException e) {
            System.out.println("\nПреобразование не удалось, так как в ячейке лежит символ или текст вместо числа.");
            System.out.println("Неверные данные лежат в ячейке: [" + e.i + "]" + "[" + e.j + "]");
        }
    }

    public static int matrix(String[][] squareMatrix) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (squareMatrix.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < squareMatrix.length; i++) {
            if (squareMatrix.length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < squareMatrix[i].length; j++) {
                try {
                   //  System.out.print(squareMatrix[i][j] + " ");
                    sum = sum + Integer.parseInt(squareMatrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                } finally {
                    System.out.print(sum + " ");
                }
            }
        }
        return sum;
    }
}