package dependency_inversion.problem;

public class PrintArea {

    public void print() {
        // here print method depends upon square and rectangle
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(5, 4);

        square.printArea();
        rectangle.printArea();
    }
}
