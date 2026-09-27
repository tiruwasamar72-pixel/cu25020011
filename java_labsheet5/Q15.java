class Shape {
    double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    double radius = 5;

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class Q15 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Rectangle Area: " + r.calculateArea());
    }
}