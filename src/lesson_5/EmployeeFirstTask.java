package lesson_5;
/*
Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса "Сотрудник" написать метод, который выводит информацию об объекте в консоль
 */

public class EmployeeFirstTask {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Ivanov Ivan Ivanovich", "engineer", "emg1@gmail.com", "+375297822199", 14000.50, 30);
        employee1.employeeInfo();
        Employee employee2 = new Employee("Stepanov Stepan Stepanovich", "manager", "emg22@gmail.com", "+375297822100", 17000.50, 32);
        employee2.employeeInfo();
        Employee employee3 = new Employee("Petrov Petr Petrovich", "driver", "emg22@gmail.com", "+375297822100", 17000.50, 32);
        employee3.employeeInfo();
        Employee employee4 = new Employee("Sidorov Artem Alekseevich", "manager", "emg52@gmail.com", "+375297842100", 18000.50, 33);
        employee4.employeeInfo();
        Employee employee5 = new Employee("Potapov Petr Ivanovich", "driver", "emg82@gmail.com", "+375297822104", 17000.20, 35);
        employee5.employeeInfo();
    }

    static class Employee {
        private String full_name;
        private String position;
        private String email;
        private String phone;
        private double salary;
        private int age;


        Employee(String full_name, String position, String email, String phone, double salary, int age) {
            this.full_name = full_name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;

        }

        public void employeeInfo() {
            System.out.println("ФИО: " + full_name + ", " + "Должность: " + position + ", " + "Email: " + email + ", " + "Телефон: " + phone + ", " + "Зарплата: " + salary + ", " + "Возраст: " + age);
        }
    }
}


