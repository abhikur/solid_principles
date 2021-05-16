package interface_segregation.problem;

public class Rectangle implements Shape {

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public int perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public double circumference() {
        return 0;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}
