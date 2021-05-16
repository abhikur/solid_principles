package single_responsibility;

/*
 Tasks of this class:
 1. create a rectangle with different length and breadth
 2. return perimeter of rectangle
 3. return area of rectangle

 Tasks this class should not do:
 1. create a square with equal sides
 2. return perimeter of square
 3. return area of square
*/

public class Rectangle {

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

    public int area() {
        return length * breadth;
    }
}
