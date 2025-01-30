package lesson_2;
/*
Написать метод, который определяет, является ли год високосным, и возвращает boolean
(високосный - true, не високосный - false). Каждый 4 год является високосным, кроме каждого 100-го,
при этом каждый 400-й - високосный
 */

public class NinthTask {
    public static void main(String[] args) {
        int year = 2024;

        leapYear(year);
    }

    static void leapYear (int x) {
        System.out.println(x % 4 == 0 && x % 100 != 0 || x % 400 == 0); /*{
            x = false;
        } else {
            x = return true;*/
        }
    }