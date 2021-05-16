package interface_segregation.solution;

public class Square implements QuadrilateralShape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int perimeter() {
        return 4 * side;
    }

    @Override
    public int area() {
        return side * side;
    }
}
