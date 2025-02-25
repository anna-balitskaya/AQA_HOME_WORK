package Lesson_6.secondTask;

public class Circle implements Interface {
    private int radius;
    private String fillColor;
    private String borderColor;

    Circle(int radius, String backgroundColor, String borderColor) {
        this.radius = radius;
        this.fillColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public int perimeter() {
        double pi = Math.PI;
        int piInt = (int) Math.floor(pi);
        return 2*piInt*radius;
    }

    @Override
    public int square() {
        double pi = Math.PI;
        int piInt = (int) Math.floor(pi);
        return piInt*(radius*radius);
    }

    public void circleInfo() {
        System.out.println();
        System.out.println("Круг:" + "\n-Площадь - " + square() + "\n-Периметр - " + perimeter() + "\n-Цвет заливки - " + fillColor + "\n-Цвет границы - " + borderColor);
    }
}
