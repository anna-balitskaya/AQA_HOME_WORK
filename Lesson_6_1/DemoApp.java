package Lesson_6_1;

public class DemoApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.name = "Murka";
        cat1.color = "White";
        cat2.name = "Murzik";
        cat2.color = "Black";


       System.out.println("Name: " + cat1.name + "," + "Color: " + cat1.color);
       System.out.println("Name: " + cat2.name + "," + "Color: " + cat2.color);
    }
}
