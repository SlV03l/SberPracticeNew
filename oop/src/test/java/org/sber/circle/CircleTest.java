package org.sber.circle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private static final Circle CIRCLE = new Circle(25, "purple");

    @Test
    void area() {
        double perResult = 1963.4954084936207;
        assertEquals(perResult, CIRCLE.area());
    }

    @Test
    void perimeter() {
        double perResult = 157.07963267948966;
        assertEquals(perResult, CIRCLE.perimeter());
    }

    @Test
    void testToString() {
        System.out.println(CIRCLE.toString());
    }
}