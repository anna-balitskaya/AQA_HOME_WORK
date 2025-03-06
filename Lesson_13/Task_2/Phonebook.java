package Lesson_13.Task_2;

import java.util.ArrayList;


public class Phonebook {
    private String surname;
    private String phone;

    public Phonebook(String surname, String phone) {
        this.surname = surname;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Фамилия: " + surname + "\nТелефон: " + phone + "\n";
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public static  ArrayList<String> findPhoneBySurname(ArrayList <Phonebook> persons, String surname) {
        ArrayList<String> phones = new ArrayList<>();
        for (Phonebook person : persons) {
            if (person.getSurname().equalsIgnoreCase(surname)) {
                phones.add(person.getPhone());
            }
        }
                return phones;
            }
        }

class ListOfPerson {
    public static void main(String[] args) {
        ArrayList<Phonebook> persons = new ArrayList<>();

        persons.add(new Phonebook("Иванов", "+375297822584"));
        persons.add(new Phonebook("Петров", "+375297823334"));
        persons.add(new Phonebook("Сидоров", "+375295823334"));
        persons.add(new Phonebook("Потапов", "+375297866584"));
        persons.add(new Phonebook("Петров", "+375297823333"));
        persons.add(new Phonebook("Дроздов", "+375297836334"));


       /* for (Phonebook person : persons) {
            System.out.println(person.toString());

        }*/

        System.out.println();
        String findSurname = "Сидоров";
        ArrayList<String> phones = Phonebook.findPhoneBySurname(persons, findSurname);
        if (!phones.isEmpty()) {
            System.out.println("Для фамилии " + findSurname + " найден номер телефона:");
            for (String phone : phones) {
                System.out.println(phone);
            }
        } else {
            System.out.println("Телефон для фамилии " + findSurname + " отсутствует в телефонном справочнике");
        }
    }
}