package org.sber.paint.figures;

import org.sber.paint.Color;
import org.sber.paint.Point;

public class Circle extends Figure{
    private final double radius;

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Нарисован круг с радиусом %s и координатами %s, %s", radius, point.getX(), point.getY());
    }

    @Override
    public void draw(Color color) {
        System.out.printf("Нарисован %s круг с радиусом %d и координатами %s, %s", color, radius, point.getX(), point.getY());
        System.out.println(point.getY());
    }
}