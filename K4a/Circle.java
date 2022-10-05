package K4a;

public class Circle extends Point {
    private double radius;

    public Circle() {}

    public Circle(int x, int y, double radiusVal) {
        super(x, y);
        setRadius(radiusVal);
    }

    public void setRadius(double radiusVal) {
        radius = (radiusVal < 0.0) ? 0.0 : radiusVal;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getDiameter() {
//        return 2 * radius;
        return 2 * getRadius();
    }

    public double getCircumference() {
        return Math.PI * getDiameter();
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public String getName() {
        return "Circle";
    }

    public String toString() {
        return "Center = " + super.toString() + ",\nRadius = " + getRadius();
    }
}
