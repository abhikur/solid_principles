package liskov_substitution;

public class Rectangle {

    private int length;

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    private int breadth;

    public int area() {
        return length * breadth;
    }
}
