package interface_segregation.problem;

public class Square implements Shape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int perimeter() {
        return 4 * side;
    }

    @Override
    public double circumference() {
        return 0;
    }

    @Override
    public double area() {
        return side * side;
    }
}
