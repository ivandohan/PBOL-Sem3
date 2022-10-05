package K4a;

public class Point extends Shape{
    private int x;
    private int y;

    public Point() {}

    public Point(int xVal, int yVal) {
        x = xVal;
        y = yVal;
    }

    public void setX(int xVal) {
        x = xVal;
    }

    public int getX() { return x; }

    public void setY(int yVal) {
        y = yVal;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return "Point";
    }

    public String toString() {
        return "[" + getX() + ", " + getY() + "]";
    }
}
