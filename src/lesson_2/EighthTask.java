package lesson_2;
/*
Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в
консоль указанную строку, указанное количество раз
 */
/*  Вариант с повторения строк при помощи встроенного метода repeat
public class Lesson_1.EighthTask {
    public static void main(String[] args) {

        printLine("Some_text ");
    }

        public static void printLine (String text) {
    System.out.println(text.repeat(3));

    }
}
*/

public class EighthTask {
    public static void main(String[] args) {
        for( int i = 0; i < 5; i++){
            printLine("Some_text ");
        }
    }
    public static void printLine (String text) {
        System.out.print(text);

    }
}