package oop1.ex;

public class RectangleProceduralMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        //넓이
        rectangle.calculateArea();
        //둘레
        rectangle.calculatePerimeter();
        //여부
        rectangle.isSquare();
    }
}
