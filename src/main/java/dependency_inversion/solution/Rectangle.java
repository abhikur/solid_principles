package dependency_inversion.solution;

public class Rectangle implements Shape {

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
