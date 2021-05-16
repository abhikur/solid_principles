package dependency_inversion.problem;

public class Rectangle {

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea() {
        System.out.println("Area of Rectangle: " + length * breadth);
    }
}
