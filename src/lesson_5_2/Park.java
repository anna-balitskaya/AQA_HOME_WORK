package lesson_5_2;

public class Park {
    private final String name;

    private class Attraction {  //вложенный нестатический класс
        private final String name_a;
        private final String information;
        private final String working_hours;
        private final double price;


        Attraction(String name_a, String information, String working_hours, double price) {
            this.name_a = name_a;
            this.information = information;
            this.working_hours = working_hours;
            this.price = price;
        }

        private void attractionInfo() {
            System.out.println("\nНазвание аттракциона: " + name_a + "\n" + "Информация о аттракционе: " + information + "\n" + "Время работы: " + working_hours + "\n" + "Стоимость: " + price);
        }
    }

    public Park(String name) {
        this.name = name;
    }

    public void parkInfo() {
        Attraction attraction1 = new Attraction("Stealth", "The UK's Fastest Launch Coaster", "9AM-7PM", 35.50);
        attraction1.attractionInfo();
        Attraction attraction2 = new Attraction("Vortex", "Spin, swing and reach for the skies on Vortex", "9AM-7PM", 40.55);
        attraction2.attractionInfo();
        Attraction attraction3 = new Attraction("Storm Surge", "Take a spin on Storm Surge", "9AM-7PM", 34.00);
        attraction3.attractionInfo();
        Attraction attraction4 = new Attraction("Colossus", "The world’s first ten-loop roller coaster", "9AM-7PM", 45.00);
        attraction4.attractionInfo();
        Attraction attraction5 = new Attraction("Nemesis Inferno", "Thorpe Park's only inverted roller coaster", "9AM-7PM", 32.57);
        attraction5.attractionInfo();

        System.out.println();
        System.out.println("Парк: " + name);
    }
}
