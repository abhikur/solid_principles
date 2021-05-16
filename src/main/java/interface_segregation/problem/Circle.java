package interface_segregation.problem;

public class Circle implements Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int perimeter() {
        return 0;
    }

    @Override
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
