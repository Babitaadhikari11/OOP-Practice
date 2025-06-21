package Polymorphism;



public class Geometry {

    
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

   
    public double calculateArea(double length, double width) {
        return length * width;
    }

 
    public double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        } else {
           
            return -1;
        }
    }

    // Main 
    public static void main(String[] args) {
        Geometry geo = new Geometry();

         
        double circleArea = geo.calculateArea(5.0);                       // Circle
        double rectangleArea = geo.calculateArea(4.0, 6.0);               // Rectangle
        double triangleArea = geo.calculateArea(3.0, 5.0, true);          // Triangle

        
        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Triangle: " + triangleArea);
    }
}
