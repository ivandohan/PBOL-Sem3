package K4a;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {}

    public Cylinder(int x, int y, double radius, double heightVal) {
        super(x, y, radius);
        setHeight(heightVal);
    }

    public void setHeight(double heightVal) {
        height = (heightVal < 0.0) ? 0.0 : heightVal;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return 2 * super.getArea() + (super.getCircumference() * getHeight());
    }

    public double getVolume() {
        return super.getArea() * getHeight();
    }

    public String getName() {
        return "Cylinder";
    }

    public String toString() {
        return super.toString() + ",\nHeight = " + getHeight();
    }
}
