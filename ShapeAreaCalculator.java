package Polymorphism;


abstract class Shape {
    abstract double calculateArea();
    abstract void displayArea();
}


class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    void displayArea() {
        System.out.println("Circle Area: " + calculateArea());
    }
}


class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    void displayArea() {
        System.out.println("Rectangle Area: " + calculateArea());
    }
}


class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    void displayArea() {
        System.out.println("Triangle Area: " + calculateArea());
    }
}


public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape triangle = new Triangle(3.0, 7.0);

        
        circle.displayArea();
        rectangle.displayArea();
        triangle.displayArea();
    }
}
