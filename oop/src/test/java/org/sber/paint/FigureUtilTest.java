package org.sber.paint;

import org.junit.jupiter.api.Test;
import org.sber.paint.figures.Circle;
import org.sber.paint.figures.Rectangle;
import org.sber.paint.figures.Square;
import org.sber.paint.figures.Triangle;
import org.sber.paint.Point;

class FigureUtilTest {

    private static final Point point = new Point (9, 5);

    @Test
    void area() {
        System.out.println(FigureUtil.area(new Circle(point, 5)));
    }

    @Test
    void perimeter() {
        System.out.println(FigureUtil.perimeter(new Rectangle(point, 4, 6)));
    }

    @Test
    void draw() {
        FigureUtil.draw(new Triangle(point, 3, 3, 3));
    }

    @Test
    void testDraw() {
        FigureUtil.draw(new Square(point, 3), Color.ORANGE);
    }
}