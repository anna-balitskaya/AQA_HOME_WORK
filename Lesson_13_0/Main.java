package Lesson_13_0;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> grade = new ArrayList<>();
        grade.add(1);
        grade.add(2);
        grade.add(3);
        grade.add(4);
        grade.add(5);
        grade.add(4, 6); //заменить элемент 5 на 6. При замене не удаляетя 5, а смещается

        System.out.println("Размер коллекции: " + grade.size());
        System.out.println("Вывод конкретного элемента по индексу 2: " + grade.get(2));
        System.out.println("Удалили элемент с индексом 0: " + grade.remove(0));
        System.out.println("Размер коллекции после удаления элемента 0: " + grade.size());
        grade.clear(); //очистили все элементы коллекции

        for(Integer el : grade){
            System.out.println(el);
        }

    }
}
