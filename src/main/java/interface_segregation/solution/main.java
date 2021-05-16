package interface_segregation.solution;

public class main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 3);
        // Here rectangle has just properties which a quadrilateral should have
        System.out.println(rectangle.perimeter());

        Circle circle = new Circle(4);
        // Here circle has just properties which a circular shape should have
        System.out.println(circle.circumference());
    }
}
