package interface_segregation.solution;

public class Circle implements CircularShape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
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
