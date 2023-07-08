package org.sber.paint;

import org.junit.jupiter.api.Test;
import org.sber.paint.figures.Circle;
import org.sber.paint.figures.Rectangle;
import org.sber.paint.figures.Square;
import org.sber.paint.figures.Triangle;

class FigureUtilTest {

    private static final Point POINT = new Point (9, 5);

    @Test
    void area() {
        System.out.println(FigureUtil.area(new Circle(POINT, 5)));
    }

    @Test
    void perimeter() {
        System.out.println(FigureUtil.perimeter(new Rectangle(POINT, 4, 6)));
    }

    @Test
    void draw() {
        FigureUtil.draw(new Triangle(POINT, 3, 3, 3));
    }

    @Test
    void testDraw() {
        FigureUtil.draw(new Square(POINT, 3), Color.ORANGE);
    }
}