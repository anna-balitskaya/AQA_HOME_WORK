package lesson_2;
/*
Создать метод CheckSumSign, в теле которого обьявлено 2 пременные a и b.
Метод должен просумировать пременные, и если сумма >=0, то вывести сообщение:
"Сумма положительная", в противном случае - "Сумма отрицательная"
*/

public class SecondTask {
    public static void main(String[] args) {
        int a = 1;
        int b = -6;

        checkSumSign(a, b);
    }

    static void checkSumSign(int x, int y) {
        int z = x + y;

        if (z >= 0)
            System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");

    }

}


