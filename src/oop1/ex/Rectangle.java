package oop1.ex;

public class Rectangle {
    int width;
    int height;
    int area;
    boolean square;

    void calculateArea() {
        area = width * height;
        System.out.println("넓이: " + area);
    }

    void calculatePerimeter() {
        area = 2 * (width + height);
        System.out.println("둘레 길이: " + area);
    }

    void isSquare() {
        square = width == height;
        System.out.println("정사각형 여부: " + square);
    }
}
