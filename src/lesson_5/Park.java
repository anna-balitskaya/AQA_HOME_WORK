package lesson_5;
/*
Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию
об аттракционах, времени их работы и стоимости
 */

public class Park {
    public static void main(String[] args) {
        Attraction attraction1 = new Attraction("Stealth", "The UK's Fastest Launch Coaster", "9AM-7PM", 35.50);
        Attraction attraction2 = new Attraction("Vortex", "Spin, swing and reach for the skies on Vortex", "9AM-7PM", 40.55);
        Attraction attraction3 = new Attraction("Storm Surge", "Take a spin on Storm Surge", "9AM-7PM", 34.00);
        Attraction attraction4 = new Attraction("Colossus", "The world’s first ten-loop roller coaster", "9AM-7PM", 45.00);
        Attraction attraction5 = new Attraction("Nemesis Inferno", "Thorpe Park's only inverted roller coaster", "9AM-7PM", 32.57);

    }
}

class Attraction {
    private String name;
    private String information;
    private String working_hours;
    private double price;

    public Attraction(String name, String information, String working_hours, double price) {
        System.out.println("\nНазвание аттракциона: " + name + "\n" + "Информация о аттракционе: " + information + "\n" + "Время работы: " + working_hours + "\n" + "Стоимость: " + price);
        System.out.println();

        this.name = name;
        this.information = information;
        this.working_hours = working_hours;
        this.price = price;
    }
}