package org.sber.circle;

public class Circle {
    private final double radius;
    private final String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle:" +
                " Radius = " + radius +
                ", Color = " + color +
                ", Area = " + area() +
                ", Perimeter = " + perimeter();
    }
}
