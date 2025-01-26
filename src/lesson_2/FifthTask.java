package lesson_2;
/*
Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
от 10 до 20 (включительно), если да - вернуть true, в противном случае - false
*/

public class FifthTask {
    public static void main(String[] args) {
        int a = 8;
        int b = 1;
        int sum = (a + b);

        check(sum);
    }
    static void check (int z) {

        System.out.println(z >= 10 && z <= 20);
    }
}