package Polymorphism;

abstract class AbstractShape {
    protected String name;

    public AbstractShape(String name) {
        this.name = name;
    }

    abstract void resize(double factor);
    abstract void rotate(double angle);
}

// Circle class
class CircleShape extends AbstractShape {
    public CircleShape(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    private double radius;

    public CircleShape(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    void resize(double factor) {
        radius *= factor;
        System.out.println(name + " resized. New radius: " + radius);
    }

    @Override
    void rotate(double angle) {
        System.out.println(name + " rotated by " + angle + " degrees (no visible change for a circle).");
    }
}

// Square class
class Square extends AbstractShape {
    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    void resize(double factor) {
        side *= factor;
        System.out.println(name + " resized. New side length: " + side);
    }

    @Override
    void rotate(double angle) {
        System.out.println(name + " rotated by " + angle + " degrees around center.");
    }
}

// Triangle class
class TriangleShape extends AbstractShape {
    private double base;
    private double height;

    public TriangleShape(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    void resize(double factor) {
        base *= factor;
        height *= factor;
        System.out.println(name + " resized. New base: " + base + ", New height: " + height);
    }

    @Override
    void rotate(double angle) {
        System.out.println(name + " rotated by " + angle + " degrees around centroid.");
    }
}

// Main class to test polymorphism
public class ShapeManipulator {
    public static void main(String[] args) {
        AbstractShape circle = new CircleShape(8);
        AbstractShape square = new Square(4);
        AbstractShape triangle = new TriangleShape(6, 3);

        // Manipulate each shape using polymorphism
        circle.resize(1.5);
        circle.rotate(90);

        square.resize(2);
        square.rotate(45);

        triangle.resize(0.5);
        triangle.rotate(30);
    }
}