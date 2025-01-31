package lesson_5;
/*
Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса "Сотрудник" написать метод, который выводит информацию об объекте в консоль
 */

public class EmployeeFirstTask {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivanov Ivan Ivanovich", "engineer", "emg1@gmail.com", 297822199, 14000.50, 30);
        Employee employee2 = new Employee("Stepanov Stepan Stepanovich", "manager", "emg22@gmail.com", 297822100, 17000.50, 32);
        Employee employee3 = new Employee("Petrov Petr Petrovich", "driver", "emg22@gmail.com", 297822100, 17000.50, 32);
        Employee employee4 = new Employee("Sidorov Artem Alekseevich", "manager", "emg52@gmail.com", 297842100, 18000.50, 33);
        Employee employee5 = new Employee("Potapov Petr Ivanovich", "driver", "emg82@gmail.com", 297822104, 17000.20, 35);
    }
}

class Employee {
    private String full_name;
    private String position;
    private String email;
    private int phone;
    private double salary;
    private int age;

    public Employee(String full_name, String position, String email, int phone, double salary, int age){
        System.out.println("ФИО: " + full_name + ", " + "Должность: " + position + ", " + "Email: " + email + ", " + "Телефон: " + phone + ", " + "Зарплата: " + salary + ", " + "Возраст: " + age);
        this.full_name = full_name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

}