package liskov_substitution;

public class Square extends Rectangle {

    private int side;

    public void setLength(int length) {
        this.side = length;
    }

    public void setBreadth(int breadth) {
        this.side = breadth;
    }

    public int area() {
        return side * side;
    }
}
