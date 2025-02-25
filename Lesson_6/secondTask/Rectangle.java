package Lesson_6.secondTask;

public class Rectangle implements Interface{
    private int sideA;
    private int sideB;
    String fillColor;
    String borderColor;

    Rectangle(int sideA, int sideB,  String backgroundColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.fillColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public int perimeter() {
        return (sideA+sideB)*2;
    }

    @Override
    public int square() {
        return sideA*sideB;
    }

    public void rectangleInfo() {
        System.out.println();
        System.out.println("Прямоугольник:" + "\n-Площадь - " + square() + "\n-Периметр " + perimeter() + "\n-Цвет заливки " + fillColor + "\n-Цвет границы - " + borderColor);
    }
}
