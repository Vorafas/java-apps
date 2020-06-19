package TwoDShape;

public class Circle extends TwoDShape {
    private final double PI = 3.14;

    Circle() {
        super();
    }

    Circle(Circle c) {
        super(c);
    }

    Circle(double x) {
        super(x, "circle");
    }

    public double area() {
        return (getWidth() / 2) * (getWidth() / 2) * 3.1416;
    }
}
