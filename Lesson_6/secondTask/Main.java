package Lesson_6.secondTask;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7, "фиолетовый", "розовый");
        Rectangle retrangle = new Rectangle(5, 2, "красный", "черный");
        Triangle triangle = new Triangle(4, 4, 2, 7, "оранжевый", "желтый");

        triangle.triangleInfo();
        retrangle.rectangleInfo();
        circle.circleInfo();
    }
}
