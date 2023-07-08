package org.sber.paint.figures;

import org.sber.paint.Color;
import org.sber.paint.Point;

public class Square extends Figure{
    private final int side;

    public Square(Point point, int side) {
        super(point);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public void draw() {
        System.out.printf("Нарисован квадрат со стороной %s и координатами %s, %s",
                side, point.getX(), point.getY());
    }

    @Override
    public void draw(Color color) {
        System.out.printf("Нарисован %s квадрат со стороной %s и координатами %s, %s",
                color, side, point.getX(), point.getY());
    }
}