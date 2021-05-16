package liskov_substitution;

public class main {

    public static void main(String[] args) {

        // In mathematics a square is a rectangle then we can substitute rectangle in place of square.
        Rectangle rectangle = new Square();
        // Setting length and breadth of a rectangle seems okay
        rectangle.setBreadth(4);
        rectangle.setLength(5);
        /* Now the Area of rectangle should be 4 * 5 = 20 but it is 25 because it is a square which has only
           one side and when we set length to 5, this sets the side of square.
        */
        System.out.println(rectangle.area());

        // This means that we cannot substitute base class in place of subclass which violates LSP.
    }
}
