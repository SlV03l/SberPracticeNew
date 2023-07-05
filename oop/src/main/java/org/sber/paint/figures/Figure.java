package org.sber.paint.figures;

import org.sber.paint.Drawable;
import org.sber.paint.Point;

public abstract class Figure implements Drawable {
    protected Point point;

    public Figure(Point point) {
        this.point = point;
    }

    public abstract double area();

    public abstract double perimeter();
}