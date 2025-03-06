package Lesson_13.Task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable <Student>{
    private String name;
    private String group;
    private int course;
    private ArrayList<Integer> grades;

    public Student (String name, String group, int course, ArrayList<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double getAVG(){
        int sum = 0;
        for (int grade : grades){
            sum +=grade;
        }
        return(double) sum/grades.size();
    }


    public void moveToNextCourse() {
        if (getAVG() >= 3) {
            course++;
        }
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\nГруппа: " + group + "\nКурс: " + course + "\nОценки: " + grades + "\nСредний балл: " + getAVG() + "\n";
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
    @Override
    public int compareTo(Student other){
        return this.name.compareTo(other.name);
    }
}

class ListOfStudents {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Иванов Иван", "1A", 1,
                new ArrayList<>(Arrays.asList(5, 4, 4, 5))));
        students.add(new Student("Петров Петр", "2A", 2,
                new ArrayList<>(Arrays.asList(3, 3, 4, 5))));
        students.add(new Student("Сидоров Алексей", "1B", 3,
                new ArrayList<>(Arrays.asList(3, 2, 3, 2))));
        students.add(new Student("Иванова Инна", "2B", 1,
                new ArrayList<>(Arrays.asList(5, 4, 4, 5))));
        students.add(new Student("Петрова Ольга", "3A", 2,
                new ArrayList<>(Arrays.asList(3, 4, 3, 5))));
        students.add(new Student("Сидорова Анна", "3B", 3,
                new ArrayList<>(Arrays.asList(4, 4, 4, 3))));

        System.out.println("Список всех студентов:");
        for (Student student : students) {
            System.out.print(student.toString());
            System.out.println();
        }

        deleteStudentsWithLowAVG(students);

        System.out.println("Список оставшихся студентов, после удаления c средним баллом меньше 3-х:");
        if (students.isEmpty()) {
            System.out.println("Все студенты имеют средний балл выше 3.");
        } else {
            for (Student student : students) {
                System.out.print(student.toString());
                System.out.println();
            }
        }
        for (Student student : students) {
            student.moveToNextCourse();
        }
        System.out.println("Список переведенных на следующий курс студентов:");
        for (Student student : students) {
            System.out.print(student.toString());
            System.out.println();
        }
        Set<Student> studentSet = new TreeSet<>(students);
        printStudents(studentSet, 1);
    }

    public static void deleteStudentsWithLowAVG(ArrayList<Student> students) {
        boolean removed = students.removeIf(student -> student.getAVG() < 3);

        if (!removed) {
            System.out.println("Удаление не требуется, так как все студенты имеют средний балл выше 3");
        }
    }

    public static void printStudents(Set<Student> students, int course) {
        boolean found = false;
        System.out.println("Студенты курса " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("На данном курсе НЕТ студентов");
        }

    }
}