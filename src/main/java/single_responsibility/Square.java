package single_responsibility;

/*
 Tasks of this class:
 1. create a square with equal sides
 2. return perimeter of square
 3. return area of square

 Tasks this class should not do:
 1. create a rectangle with different length and breadth
 2. return perimeter of rectangle
 3. return area of rectangle
*/

public class Square {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int perimeter() {
        return 4 * side;
    }

    public int area() {
        return side * side;
    }
}
