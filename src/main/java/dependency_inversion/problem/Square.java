package dependency_inversion.problem;

import dependency_inversion.solution.Shape;

public class Square implements Shape {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void printArea() {
        System.out.println("Area of Square: " + side * side);
    }
}
