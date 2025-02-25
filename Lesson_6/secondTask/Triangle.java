package Lesson_6.secondTask;

public class Triangle implements Interface{
    private String fillColor;
    private String borderColor;
    private int height;
    private int sideA;
    private int sideB;
    private int sideC;

    Triangle(int sideA, int sideB, int sideC, int height, String backgroundColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
        this.fillColor = backgroundColor;
        this.borderColor = borderColor;
    }

    @Override
    public int perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public int square() {
        return (sideA * height) / 2;
    }

    public void triangleInfo() {
        System.out.println();
        System.out.println("Треугольник:" + "\n-Площадь - " + square() + "\n-Периметр - " + perimeter() + "\n-Цвет заливки - " + fillColor + "\n-Цвет границы - " + borderColor);
    }
}
