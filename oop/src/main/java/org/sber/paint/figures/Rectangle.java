package org.sber.paint.figures;

import org.sber.paint.Color;
import org.sber.paint.Point;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(Point point, double width, double height) {
        super(point);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public void draw() {
        System.out.printf("Нарисован прямоугольник с шириной %s, высотой %s и координатами %s, %s", width, height, point.getX(), point.getY());
    }

    @Override
    public void draw(Color color) {
        System.out.printf("Нарисован %s прямоугольник с шириной %s, высотой %s и координатами %s, %s", color, width, height, point.getX(), point.getY());
    }
}