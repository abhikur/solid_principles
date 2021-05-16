package dependency_inversion.solution;

import java.util.List;

public class PrintArea {

    public void print(List<Shape> shapes) {
        // here print method does not depend upon low level details but an abstraction over them.
        for (Shape shape: shapes) {
            shape.printArea();
        }
    }
}
