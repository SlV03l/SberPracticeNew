package org.sber.paint.figures;

import org.sber.paint.Color;
import org.sber.paint.Point;

public class Triangle extends Figure{
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(Point point, double side1, double side2, double side3) {
        super(point);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void draw() {
        System.out.printf("Нарисован треугольник со сторонами %s, %s, %s и координатами %s, %s",
                side1, side2, side3, point.getX(), point.getY());
    }

    @Override
    public void draw(Color color) {
        System.out.printf("Нарисован %s треугольник со сторонами %s, %s, %s и координатами %s, %s",
                color, side1, side2, side3, point.getX(), point.getY());
    }
}