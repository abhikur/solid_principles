package interface_segregation.solution;

public class Rectangle implements QuadrilateralShape {

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
    public int area() {
        return length * breadth;
    }
}
