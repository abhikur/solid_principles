package single_responsibility;

/*
 Tasks of this class:
 1. create a rectangle with different length and breadth
 2. return perimeter of rectangle
 3. return area of rectangle
 4. create a square with equal sides
 5. return perimeter of square
 6. return area of square
*/

public class Shape {

    private final int length;
    private final int breadth;

    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int perimeterOfRectangle() {
        return 2 * (length + breadth);
    }

    public int areaOfRectangle() {
        return length * breadth;
    }

    public int perimeterOfSquare() {
        return 4 * length;
    }

    public int areaOfSquare() {
        return length * breadth;
    }
}
