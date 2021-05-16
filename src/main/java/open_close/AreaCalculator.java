package open_close;

public class AreaCalculator {

    int calculate(Shape[] shapes) {
        int totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }
}
