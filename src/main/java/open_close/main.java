package open_close;

public class main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        Shape rectangle = new Rectangle(4, 3);
        Shape square = new Square(4);

        /* Here we have AreaCalculator which takes list of shapes and return the sum of their areas.
           Now if a new shape comes then we don't need to modify the AreaCalculator. Just create a
           new class and pass in the list here. This way we are expanding the functionality of Area
           Calculator to support new shapes without altering its logic.
         */
        int totalArea = calculator.calculate(new Shape[]{square, rectangle});
        System.out.println(totalArea);
    }
}
