package dependency_inversion.solution;

import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {
        PrintArea printArea = new PrintArea();
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(5, 4);

        List<Shape> shapes = Arrays.asList(square, rectangle);
        printArea.print(shapes);
    }
}
