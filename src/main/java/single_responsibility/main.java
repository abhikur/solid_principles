package single_responsibility;

public class main {

    public static void main(String[] args) {

        /* Here we are creating shape and asking perimeter and area of both square and rectangle.
           Which means it is doing 2 things and lets say in future if we have more shapes then
           this class will expand more and more. Which does not seems right
         */
        Shape shape = new Shape(3, 3);

        System.out.println("perimeter of square: " + shape.perimeterOfSquare());
        System.out.println("perimeter of rectangle: " + shape.perimeterOfRectangle());
        System.out.println("area of square: " + shape.areaOfSquare());
        System.out.println("area of rectangle: " + shape.areaOfRectangle());

        /* Here we are creating different classes for each shape and dividing responsibility to
           respective shape. This way we will not bloat a single class. It is now more readable
           because it is doing only that which is required.
         */

        Square square = new Square(4);
        System.out.println("perimeter of square: " + square.perimeter());
        System.out.println("area of square: " + square.area());

        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("perimeter of rectangle: " + rectangle.perimeter());
        System.out.println("area of rectangle: " + rectangle.area());
    }
}
