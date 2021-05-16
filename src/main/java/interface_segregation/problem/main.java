package interface_segregation.problem;

public class main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 3);
        // Here circumference of rectangle does not make any sense
        System.out.println(rectangle.circumference());

        Circle circle = new Circle(4);
        // Here perimeter of circle does not make any sense
        System.out.println(circle.perimeter());

        // This means that we are enforcing shapes to have some properties which they does not use
    }
}
